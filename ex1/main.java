import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double num1;
        double num2;
        double resultado = 0;
        Calculadora calculadora;

        do {
            System.out.println("\nInforme o tipo de operação que deseja realizar: ");
            System.out.println("~~adição - 1");
            System.out.println("~~subtração - 2");
            System.out.println("~~multiplicação - 3");
            System.out.println("~~divisão - 4");
            System.out.println("~~encerrar - 5");
            System.out.print("opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("\nInforme os valores");
                System.out.print("~~valor 1: ");
                num1 = scanner.nextFloat();

                System.out.print("~~valor 2: ");
                num2 = scanner.nextFloat();
    
                calculadora = new Calculadora(num1, num2, opcao);
                resultado = calculadora.getResult();

                System.out.println("O resultado da operação é: " + resultado);
            } else if (opcao == 5) {
                    break;
            } else {
                System.out.println("Operação inválida!");
            }
        } while (opcao != 5);
    }
}
