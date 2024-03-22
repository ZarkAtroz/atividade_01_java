import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/*BANCO DA CIDADINHA: 
1 - Cadastrar conta
2 - Sacar
3 - Depositar
4 - Transferir
5 - Listar contas
6 - Saldo
7 - Sair

Digite a opção desejada: 1

Digite o nome do titular: cz
Digite o número da conta: 001
Saldo inicial: R$ 0,00
Conta cadastrada com sucesso

BANCO DA CIDADINHA: 
1 - Cadastrar conta
2 - Sacar
3 - Depositar
4 - Transferir
5 - Listar contas
6 - Saldo
7 - Sair

Digite a opção desejada: 1

Digite o nome do titular: vzbv
Digite o número da conta: 002
Saldo inicial: R$ 0,00

Conta cadastrada com sucesso
Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        at main.main(main.java:41)
PS C:\Users\Gabriel\Documents\GitHub\Repos\ex3>  */

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        int opcao = 0;

        do {
            System.out.println("\nBANCO DA CIDADINHA: ");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Listar contas");
            System.out.println("6 - Saldo");
            System.out.println("7 - Sair\n");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1://Cadastrar conta
                    System.out.print("\nDigite o nome do titular: ");
                    String nomeTitular = scanner.next();

                    if (nomeTitular == null || nomeTitular.isEmpty()) {
                        System.out.println("Nome inválido");
                        break;
                    }

                    System.out.print("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();

                    if (numeroConta <= 0) {
                        System.out.println("\nNúmero de conta inválido");
                        break;
                    } else if (contas.size() > 0) {
                        int tamanho = contas.size();
                        for (int i = 0; i < tamanho; i++) {
                            if (contas.get(i).getNumeroConta() == numeroConta) {
                                System.out.println("\nNúmero de conta já cadastrado");
                                break;
                            } else {
                                System.out.println("Saldo inicial: R$ 0,00");
                                double saldo = 0.0;
                                
                                ContaBancaria novaConta = new ContaBancaria(nomeTitular, numeroConta, saldo);
                        
                                contas.add(novaConta);
                                System.out.println("\nConta cadastrada com sucesso");

                            }
                        }
                        
                    } else {
                        System.out.println("Saldo inicial: R$ 0,00");
                        double saldo = 0.0;
                        
                        ContaBancaria novaConta = new ContaBancaria(nomeTitular, numeroConta, saldo);
                
                        contas.add(novaConta);
                        System.out.println("Conta cadastrada com sucesso");
                        System.out.print("AAA");
                        
                    }
                    scanner.nextLine();
                    break;
                
                case 2://Sacar
                    System.out.println("\nDigite o número da conta: ");
                    int numeroContaSaque = scanner.nextInt();
                    
                    System.out.println("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();

                    for (ContaBancaria contaBancaria : contas) {
                        if (contaBancaria.getNumeroConta() == numeroContaSaque) {
                            contaBancaria.sacar(valorSaque);
                        }
                    }
                    break;

                case 3://Depositar
                    System.out.println("\nDigite o número da conta: ");
                    int numeroContaDeposito = scanner.nextInt();
                    
                    System.out.println("Digite o valor do deposito: ");
                    double valorDeposito = scanner.nextDouble();

                    for (ContaBancaria contaBancaria : contas) {
                        if (contaBancaria.getNumeroConta() == numeroContaDeposito) {
                            contaBancaria.depositar(valorDeposito);
                        }
                    }
                    break;

                case 4://Transferir
                    System.out.println("\nDigite o número da conta de origem: ");
                    int numeroContaOrigem = scanner.nextInt();

                    System.out.println("Digite o número da conta de destino: ");
                    int numeroContaDestino = scanner.nextInt();

                    System.out.println("Digite o valor da transferência: ");
                    double valorTransferencia = scanner.nextDouble();

                    ContaBancaria contaOrigem = null;
                    ContaBancaria contaDestino = null;

                    for (ContaBancaria contaBancaria : contas) {
                        if (contaBancaria.getNumeroConta() == numeroContaOrigem) {
                            contaOrigem = contaBancaria;
                        }

                        if (contaBancaria.getNumeroConta() == numeroContaDestino) {
                            contaDestino = contaBancaria;
                        }
                    }

                    if (contaOrigem != null && contaDestino != null) {
                        contaOrigem.transferir(valorTransferencia, contaDestino);
                    } else {
                        System.out.println("Conta de origem ou destino não encontrada");
                    }
                    break;

                case 5://Listar contas
                    for (ContaBancaria contaBancaria : contas) {
                        System.out.println("Quantidade de contas: " + contas.size());
                        System.out.println("Nome: " + contaBancaria.getNomeTitular());
                    }
                    break;
                
                case 6://Saldo
                    System.out.println("Digite o número da conta: ");
                    int numeroContaSaldo = scanner.nextInt();

                    for (ContaBancaria contaBancaria : contas) {
                        if (contaBancaria.getNumeroConta() == numeroContaSaldo) {
                            System.out.println("Nome: " + contaBancaria.getNomeTitular());
                            System.out.println("Saldo: " + contaBancaria.getSaldo());
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    break;
            }
            System.out.print("BBB");
        } while (opcao != 7);

        System.out.print("CCC");
        scanner.close();
    }
}
