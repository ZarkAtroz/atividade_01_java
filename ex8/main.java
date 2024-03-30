import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        pedido.addPedido(new Pizza(1, "Rua 1", 1, 1));
        pedido.addPedido(new Pizza(2, "Rua 2", 2, 2));
        pedido.addPedido(new Pizza(3, "Rua 3", 3, 3));

        while (opcao != 4) {
            pedido.menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nID do pedido: " + pedido.pedidos.size() + 1);
                    int id = pedido.pedidos.size() + 1;

                    pedido.saborPizza();
                    int sabor = scanner.nextInt();

                    pedido.tamanhoPizza();
                    int tamanho = scanner.nextInt();

                    System.out.print("Digite o endereço: ");
                    String endereco = scanner.nextLine();

                    if (endereco.isEmpty()) {
                        endereco = scanner.nextLine();
                        
                    }
                    
                    System.out.println("\nPedido adicionado com sucesso!");
                    pedido.addPedido(new Pizza(id, endereco, sabor, tamanho));
                    break;
                case 2:
                    System.out.print("Digite o ID do pedido que deseja cancelar: ");
                    id = scanner.nextInt();
                    pedido.cancelPedido(id);
                    break;
                case 3:
                    pedido.relatorioPedidos();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
