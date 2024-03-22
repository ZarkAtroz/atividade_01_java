import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
//Desenvolva a classe Livro com os atributos título, autor e ano. Implemente um construtor para inicializar esses atributos quando um novo livro for instanciado no seu sistema. Adicione um método exibirInfo() para mostrar todos os dados do livro na tela

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Livro> bibList = new ArrayList<Livro>();

        int opcao = 0;

        do {
            System.out.println("\nAdicionar novo livro:");
            System.out.println("~~SIM - 1");
            System.out.println("~~NAO - 2");
            System.out.print("OPCAO: ");
            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                Livro novoLivro = new Livro();

                System.out.print("Título: ");
                novoLivro.titulo = scanner.nextLine();

                System.out.print("Autor: ");
                novoLivro.autor = scanner.nextLine();

                System.out.print("Data de publicação: ");
                novoLivro.ano = scanner.nextLine();

                bibList.add(novoLivro);

            } else if(opcao == 2) {
                System.out.println("\nSaindo...");
            } else if(opcao != 1 || opcao != 2) {
                System.out.println("\nOPCAO INVALIDA");
            }
            
        } while (opcao != 2);

        for (int j = 0; j < bibList.size(); j++) {
            System.out.println("\nLivro " + (j+1));
            bibList.get(j).exibirInfo();
        }
        
    }
}
