public class Main {
    public static void main(String[] args) {

        /* 
         *          >>>> IMPORTANTE <<<<
         * 
         *  --> TODAS AS FUNÇÕES ESTÃO COMENTADAS.
         *  --> ALGUMAS FUNÇÕES ESTÃO COMO PRIVATE, SENDO EXECUTADAS DENTRO DE OUTRAS FUNÇÕES
         * 
         *  Author: Alexandre William Oliveira Coelho
         */
        
        //TESTAR OBJETOS DE TAMANHO IGUAL
        /* for (int i = 10; i > 0; i--) {
            Livro livro = new Livro("Fulano" + i, "A volta dos que não foram " + i, 120 * i);
            Vetor.inserir(livro);
        } */

        //TESTAR OBJETOS DIFERENTES
        /* Livro livro1 = new Livro("Fulano", "z", 1200);
        Livro livro2 = new Livro("Cicrano", "x", 1200);
        Livro livro3 = new Livro("Betrano", "g", 1200);
        Livro livro4 = new Livro("Ciclano", "a", 1200);
        Livro livro5 = new Livro("Mito", "k", 1200);
        Livro livro6 = new Livro("Lula", "l", 1200);
        Livro livro7 = new Livro("Antonio Fagundes", "q", 1200);
        Livro livro8 = new Livro("Shaolin Brabo", "h", 1200);
        Livro livro9 = new Livro("Irineu", "j", 1200);
        Livro livro10 = new Livro("Oswaldo", "w", 1200);
        Vetor.inserir(livro1);
        Vetor.inserir(livro2);
        Vetor.inserir(livro3);
        Vetor.inserir(livro4);
        Vetor.inserir(livro5);
        Vetor.inserir(livro6);
        Vetor.inserir(livro7);
        Vetor.inserir(livro8);
        Vetor.inserir(livro9);
        Vetor.inserir(livro10); */

        //BUSCAR TÍTULO DO LIVRO
        /* Livro resultado = Vetor.buscarItem("A volta dos que não foram 0"); //MUDE AQUI O PARAMETRO A SER PROCURADO
        if (resultado != null) {
            System.out.println(resultado);
        }
        else {
            System.out.println("Resultado não encontrado!");
        } */


        //INSERIR UM NOVO ITEM NO VETOR
        /* Livro livro = new Livro("Marmanjo", "Nao sei de nada", 1200);
        Vetor.inserir(livro); */

        //REMOVER UM ITEM DO VETOR, PELO ID DO ITEM (OBS: O ID É GERADO ALEATÓRIAMENTE, CERTIFIQUE-SE DE SABER O ID PRIMEIRO)
        /* Vetor.remover(0); */

        //MOSTRAR TODOS OS ITENS DO VETOR
        /* Vetor.mostrar(); */
        
    }
}
