import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estoque> produto = new ArrayList<Estoque>();
        int tamanho = produto.size();

        String codigo;
        String nome;
        int quantidade;
        double preco;

        produto.add(new Estoque("Arroz", "000001", 10, 10.0));
        produto.add(new Estoque("Feijão", "000002", 20, 5.0));
        produto.add(new Estoque("Macarrão", "000003", 30, 3.0));
        produto.add(new Estoque("Carne", "000004", 40, 20.0));
        produto.add(new Estoque("Frango", "000005", 50, 15.0));

        int opc = 0;

        do {
            System.out.println("[1] - ADICIONAR PRODUTO");
            System.out.println("[2] - LISTAR PRODUTOS");
            System.out.println("[3] - EDITAR PRODUTO");
            System.out.println("[4] - REMOVER PRODUTO");
            System.out.println("[5] - RELATÓRIO DE ESTOQUE");
            System.out.println("[6] - SAIR");
            System.out.print("OPCAO: ");
            opc = scanner.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.print("\nCODIGO: ");
                    codigo = scanner.next();

                    if (produto.size() > 0) {
                        for (int i = 0; i < produto.size(); i++) {
                            if (produto.get(i).verificaCodigo(codigo)) {
                                System.out.println("\nCÓDIGO JÁ CADASTRADO\n");
                                break;
                            }
                        }
                        
                    }

                    System.out.print("NOME: ");
                    nome = scanner.next();

                    System.out.print("QUANTIDADE: ");
                    quantidade = scanner.nextInt();

                    System.out.print("PRECO: ");
                    preco = scanner.nextDouble();

                    produto.add(new Estoque(nome, codigo, quantidade, preco));

                    scanner.nextLine();
                    break;

                case 2:
                    System.out.println("");
                    for (int i = 0; i < produto.size(); i++) {
                        produto.get(i).listaProdutos();
                    }
                    System.out.println("");
                    break;

                case 3:

                    System.out.print("\nCÓDIGO: ");
                    codigo = scanner.next();

                    for (int i = 0; i < produto.size(); i++) {
                        if (produto.get(i).verificaCodigo(codigo)) {

                            System.out.print("NOVA QUANTIDADE: ");
                            quantidade = scanner.nextInt();
                            produto.get(i).setQuantidade(quantidade);

                            System.out.print("NOVO PREÇO: ");
                            preco = scanner.nextDouble();
                            produto.get(i).setPreco(preco);
                            break;
                        }
                    }

                    break;

                case 4:
                    System.out.print("\nCÓDIGO: ");
                    codigo = scanner.next();

                    for (int i = 0; i < produto.size(); i++) {
                        if (produto.get(i).verificaCodigo(codigo)) {
                            produto.remove(i);
                            System.out.println("PRODUTO REMOVIDO");
                            break;
                        }
                    }

                    break;

                case 5://Gerar relatório: produtos disponíveis, quantidade em estoque e valor total em estoque
                    System.out.println("##RELATÓRIO DE ESTOQUE##\n");
                    for (int i = 0; i < produto.size(); i++) {
                        System.out.println("PRODUTO: " + produto.get(i).getNome());
                        System.out.println("QUANTIDADE: " + produto.get(i).getQuantidade());
                        System.out.println("VALOR TOTAL: " + produto.get(i).getQuantidade() * produto.get(i).getPreco());
                        System.out.println("-------------------------------");
                    }
                    break;
                
                case 6:
                    System.out.println("\nSAINDO ...");
                    break;
                
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA");
                    break;
            }
        } while (opc != 6);
    }
}
