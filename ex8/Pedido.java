import java.util.List;
import java.util.ArrayList;

public class Pedido {
    List<Pizza> pedidos = new ArrayList<Pizza>();
    

    int saborValor;

    void menu() {
        System.out.println("1 - Adicionar Pedido");
        System.out.println("2 - Cancelar Pedido");
        System.out.println("3 - Relatório de Pedidos");
        System.out.println("4 - Sair");
        System.out.print("Digite a opção desejada: ");
    }

    void saborPizza() {
        System.out.println("\n1 - Calabresa");
        System.out.println("2 - Queijo");
        System.out.println("3 - Vegetariana");
        System.out.print("Digite o sabor da pizza: ");
    }

    void tamanhoPizza() {
        System.out.println("\n1 - Pequena");
        System.out.println("2 - Média");
        System.out.println("3 - Grande");
        System.out.print("Digite o tamanho da pizza: ");
    }

    int addPedido(Pizza pizza) {
        pedidos.add(pizza);
        return pizza.getId();
    }

    double calculaPreco(Pizza pizza, int sabor) {
        double preco = 0;
        switch (pizza.getTamanho()) {
            case 1:
                preco = 20;
                break;
            case 2:
                preco = 30;
                break;
            case 3:
                preco = 40;
                break;
        }

        if (pizza.getSabor() == 1) {
            preco += 5;
        } else if (pizza.getSabor() == 2) {
            preco += 10;
        } else if (pizza.getSabor() == 3) {
            preco += 15;
        }

        return preco;
    }

    void cancelPedido(int id) {
        for (Pizza pizza : pedidos) {
            if (pizza.getId() == id) {
                pedidos.remove(pizza);
                break;
            }
        }
    }

    void relatorioPedidos( ) {
        for (Pizza pizza : pedidos) {
            System.out.println("\nID: " + pizza.getId());
            System.out.println("Endereço: " + pizza.getEndereco());
            System.out.println("Sabor: " + pizza.getSabor());
            System.out.println("Tamanho: " + pizza.getTamanho());
            System.out.println("Preço: " + calculaPreco(pizza, saborValor));
            System.out.println();
        }
    }


}