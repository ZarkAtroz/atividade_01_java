public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    Carro(String marca, String modelo, int ano, String placa) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public int verificaPlca(String placa) {
        if (this.placa.equals(placa)) {
            return 1;
        } else {
            return 0;
        }
    }

    public int verificaCarro(String placa, String marca) {

        if (this.placa.equals(placa) && this.marca.equals(marca)) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void frear() {
        this.velocidadeAtual -= 10;
    }
}
