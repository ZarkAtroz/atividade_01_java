public class Estoque {
    //informações sobre cada item do mercado, entre nome, código do produto, quantidade em estoque e preço
    private String nome;
    private String codigo;
    private int quantidade;
    private double preco;


    public Estoque(String nome, String codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public boolean verificaCodigo(String codigo){
        if (this.codigo == codigo){
            return true;
        }
        return false;
    }

    public void listaProdutos(){
        System.out.println("PRODUTO: " + getNome() + " / CODIGO: " + getCodigo());
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
