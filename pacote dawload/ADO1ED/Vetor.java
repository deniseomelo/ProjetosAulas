public class Vetor {
    
    //VETOR DE OBJETOS (LIVROS)
    public static Livro[] lista = new Livro[4];
    private static int indicio = 0;

    //INSERE UM NOVO LIVRO
    public static void inserir(Livro livro) {
        if (indicio < lista.length) {
            lista[indicio++] = livro;
        }
        else {
            lista = aumentarVetor();
            lista[indicio++] = livro;
        }
    }

    //AUMENTA O TAMANHO DO VETOR DE FORMA DINÂMICA
    private static Livro[] aumentarVetor() {
        Livro[] listaNova = new Livro[lista.length * 2];
        for (int i = 0; i < lista.length; i++) {
            listaNova[i] = lista[i];
        }
        return listaNova;
    }

    //REMOVE O ITEM DO VETOR PELO ID, E ALTERA O TAMANHO DO VETOR
    public static void remover(int id) {
        Livro[] listaNova = new Livro[indicio];
        for (int i = 0, j = 0; i < indicio; i++) {
            if (lista[i].getId() != id) {
                listaNova[j++] = lista[i];
            }
        }
        lista = listaNova;
    }
    
    //MOSTRA OS ITENS DO VETOR
    public static void mostrar() {
        ordenarID(lista, 0, indicio - 1);
        int controle = 0;
        for (Livro i : lista) {
            if (i != null) {
                System.out.println(i);
            }
            if (i == null) {
                controle++;
            }
        }
        if (controle == indicio) {
            System.out.println("[vazio]");
        }
    }

    //BUSCA UM ITEM DO VETOR PELO TÍTULO
    public static Livro buscarItem(String nome) {

        int[] unicode = new int[indicio];

        for (int i = 0; i < unicode.length; i++) {
            String palavra = lista[i].getTitulo();
            for (int j = 0; j < palavra.length(); j++) {
                unicode[i] += palavra.charAt(j);
            }
        }
        
        int inicio = 0, fim = indicio - 1;

        ordenarTitulo(unicode, lista, 0, indicio - 1);

        int unicodePalavra = 0;
        for (int i = 0; i < nome.length(); i++) {
            unicodePalavra += nome.charAt(i);
        }
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (unicode[meio] == unicodePalavra) {
                return lista[meio];
            }
            else if (unicodePalavra > unicode[meio]) {
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }
        return null;
    }

    //ORDENA O VETOR PELO ID DO ITEM (QUICKSORT)
    public static void ordenarID(Livro[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int pivotIndex = particao(lista, inicio, fim);
            ordenarID(lista, inicio, pivotIndex - 1);
            ordenarID(lista, pivotIndex + 1, fim);
        }
    }

    //PARTITION DO QUICKSORT
    private static int particao(Livro[] lista, int inicio, int fim) {
        int pivot = lista[fim].getId();
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (lista[j].getId() <= pivot) {
                i++;
                int aux = lista[i].getId();
                lista[i].setId(lista[j].getId());
                lista[j].setId(aux);
            }
        }

        int aux = lista[i+1].getId();
        lista[i+1].setId(lista[fim].getId());
        lista[fim].setId(aux);

        return i + 1;
    }

    //ORDENA O VETOR PELO TÍTULO (QUICKSORT)
    private static void ordenarTitulo(int[] unicode, Livro[] nomes, int inicio, int fim) {
        if (inicio < fim) {
            int pivotIndex = partition(unicode, nomes, inicio, fim);
            ordenarTitulo(unicode, nomes, inicio, pivotIndex - 1);
            ordenarTitulo(unicode, nomes, pivotIndex + 1, fim);
        }
    }

    //PARTITION DO QUICKSORT
    private static int partition(int[] unicode, Livro[] nomes, int inicio, int fim) {
        int pivot = unicode[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (unicode[j] <= pivot) {
                i++;
                int aux = unicode[i];
                unicode[i] = unicode[j];
                unicode[j] = aux;
                String temp = nomes[i].getTitulo();
                nomes[i].setTitulo(nomes[j].getTitulo());
                nomes[j].setTitulo(temp);
            }
        }

        int aux = unicode[i+1];
        unicode[i+1] = unicode[fim];
        unicode[fim] = aux;
        String temp = nomes[i+1].getTitulo();
        nomes[i+1].setTitulo(nomes[fim].getTitulo());
        nomes[fim].setTitulo(temp);

        return i + 1;
    }
}
