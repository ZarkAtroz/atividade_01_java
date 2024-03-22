public class Calculadora {
    int opcao;
    double num1;
    double num2;
    double result = 0;

    public Calculadora(double n1, double n2, int op){
        num1 = n1;
        num2 = n2;
        opcao = op;

        if (opcao == 1) {
            somar(num1, num2);
        } else if (opcao == 2) {
            subtrair(num1, num2);
        } else if (opcao == 3) {
            multiplicar(num1, num2);
        } else if (opcao == 4) {
            dividir(num1, num2);
        }
    }

    public double getResult() {
        return result;
    }

    void somar(double num1, double num2){
        result = num1 + num2;
    }

    void subtrair(double num1, double num2){
        result = num1 - num2;
    }

    void multiplicar(double num1, double num2){
        result = num1 * num2;
    }

    void dividir(double num1, double num2){
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.\n");
        }
    }
}