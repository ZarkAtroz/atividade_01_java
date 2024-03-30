import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        String nome;
        String telefone;

        Agenda agenda = new Agenda();

        while (opcao != 5) {
            agenda.exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.err.println("INFORME O NOME DO CONTATO:");
                    nome = scanner.next();

                    System.err.println("INFORME O TELEFONE DO CONTATO:");
                    telefone = scanner.next();

                    agenda.adicionarContato(new Contato(nome, telefone));

                    break;
                case 2:
                    System.err.println("INFORME O NOME DO CONTATO:");
                    nome = scanner.next();

                    if (agenda.buscarContato(nome) != null){
                        System.out.println("CONTATO REMOVIDO!");
                    }

                    break;
                case 3:
                    agenda.listarContatos();

                    break;
                case 4:
                    System.err.println("INFORME O NOME DO CONTATO:");
                    nome = scanner.next();

                    if (agenda.buscarContato(nome) != null){
                        System.out.println("CONTATO ENCONTRADO!");
                    }

                    break;
                case 5:
                    System.out.println("SAINDO...");

                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");

                    break;
            }
        }
    }
}
