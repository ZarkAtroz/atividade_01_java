public class Pizza {
    private int id;
    private String endereco;
    private int sabor;
    private int tamanho;

    public Pizza(int id, String endereco, int sabor, int tamanho) {
        this.id = id;
        this.endereco = endereco;
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getSabor() {
        return sabor;
    }

    public int getTamanho() {
        return tamanho;
    }

}