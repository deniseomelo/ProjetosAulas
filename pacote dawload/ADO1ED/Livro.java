public class Livro {
    
    private int id = 0;
    private String autor, titulo;
    private double preco;

    protected int getId() {
        return id;
    }
    protected void setId(int id) {
        this.id = id;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro() {}

    public Livro(String autor, String titulo, double preco) {
        this.id = auto_generate();
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nAutor: " + autor + "\nTítulo: " + titulo + "\nPreço: " + preco + "\n";
    }

    /* 
     * OS ATRIBUTOS E MÉTODOS ABAIXO, CONTROLAM OS NÚMEROS
     * ALEATÓRIOS GERADOS NO ID, PARA QUE NÃO HAJA REPETIÇÃO
     */

    //GUARDA OS NÚMEROS GERADOS
    private static int[] generatedNumbers = new int[4];
    private static int index = 0;

    //GERA OS NÚMEROS ALEATÓRIOS
    private static int auto_generate() {
        int random = (int)(Math.random() * Integer.MAX_VALUE);
        if (index < generatedNumbers.length) {
            if (index > 0) {
                random = noRepeat(random);
            }
            generatedNumbers[index++] = random;
            return random;
        }
        else {
            generatedNumbers = aumentarVetor();
            random = noRepeat(random);
            generatedNumbers[index++] = random;
            return random;
        }
    }

    //VERIFICA E CONTROLA O NÚMERO PARA QUE NÃO SEJA GERADO UM NÚMERO IGUAL
    private static int noRepeat(int random) {
        for (int i = 0; i < generatedNumbers.length; i++) {
            for (int j = 0; j < generatedNumbers.length; j++) {
                if (random == generatedNumbers[j] && i != j) {
                    random = (int)(Math.random() * Integer.MAX_VALUE);
                    i = 0;
                }
            }
        }
        return random;
    }

    //AUMENTA O TAMANHO DO VETOR DE NÚMEROS GERADOS DE FORMA DINÂMICA
    private static int[] aumentarVetor() {
        int[] listaNova = new int[generatedNumbers.length * 2];
        for (int i = 0; i < generatedNumbers.length; i++) {
            listaNova[i] = generatedNumbers[i];
        }
        return listaNova;
    }
}