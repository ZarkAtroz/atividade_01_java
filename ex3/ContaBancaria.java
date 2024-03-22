import java.util.List;
public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nome, int numero, double saldo) {
        this.nomeTitular = nome;
        this.saldo = saldo;
        this.numeroConta = numero;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void sacar(double valor) {
        if (valor >= this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valor;
        }
        System.out.println("Depósito realizado com sucesso");
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência para "+ contaDestino.nomeTitular +" realizada com sucesso");
        }
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
