public class Livro {
    String titulo;
    String autor;
    String ano;

    public Livro() {
        System.out.print("\n");
    }

    void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}
