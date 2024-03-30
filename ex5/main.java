import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<Carro>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int quantCarros = 0;

        String marca;
        String modelo;
        int ano;

        carros.add(new Carro("Fiat", "Uno", 2020, "ABC-1234"));
        carros.add(new Carro("Chevrolet", "Onix", 2020, "DEF-5678"));
        carros.add(new Carro("Ford", "Ka", 2020, "GHI-9101"));

        do {
            System.out.println("[1] ADICIONAR CARRO");
            System.out.println("[2] LISTAR CARROS");
            System.out.println("[3] ACELERAR CARRO");
            System.out.println("[4] FREAR CARRO");
            System.out.println("[5] SAIR");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nINFORME A PLACA DO CARRO: ");
                    String placa = scanner.next();

                    for (int i = 0; i < carros.size(); i++) {
                        if (carros.get(i).verificaPlca(placa) == 1) {
                            System.out.println("\nPLACA JA CADASTRADA\n");
                            break;
                        } else if (i == carros.size() - 1) {
                            System.out.print("INFORME A MARCA DO CARRO: ");
                            marca = scanner.next();
        
                            System.out.print("INFORME O MODELO DO CARRO: ");
                            modelo = scanner.next();
        
                            System.out.print("INFORME O ANO DO CARRO: ");
                            ano = scanner.nextInt();
        
                            carros.add(new Carro(marca, modelo, ano, placa));
                            System.out.println("\nCARRO CADASTRADO COM SUCESSO\n");
                            
                        }
                    }

                    break;
                
                case 2:
                    System.out.println("\nLISTA DE CARROS\n");
                    for (Carro carro : carros) {
                        System.out.println("PLACA: " + carro.getPlaca());
                        System.out.println("MARCA: " + carro.getMarca());
                        System.out.println("MODELO: " + carro.getModelo());
                        System.out.println("ANO: " + carro.getAno());
                        System.out.println("VELOCIDADE ATUAL: " + carro.getVelocidadeAtual());
                        System.out.println("\n");
                    }

                    break;

                case 3:
                    System.out.print("\nINFORME A PLACA DO CARRO: ");
                    placa = scanner.next();

                    System.out.print("INFORME A MARCA DO CARRO: ");
                    marca = scanner.next();

                    for (Carro carro : carros) {
                        quantCarros++;
                        if (carro.verificaCarro(placa, marca) == 1) {
                            carro.acelerar();
                            System.out.println("\nCARRO ACELERADO COM SUCESSO\n");
                        } else if (quantCarros == carros.size()) {
                            System.out.println("\nCARRO NAO ENCONTRADO\n");
                        } else if (quantCarros == carros.size() && carros.size() == 0) {
                            System.out.println("\nNAO HA CARROS CADASTRADOS\n");
                            
                        }
                    }
                    
                    break;

                case 4:
                System.out.print("\nINFORME A PLACA DO CARRO: ");
                placa = scanner.next();

                System.out.print("INFORME A MARCA DO CARRO: ");
                marca = scanner.next();

                for (Carro carro : carros) {
                    quantCarros++;
                    if (carro.verificaCarro(placa, marca) == 1) {
                        carro.frear();
                        System.out.println("\nCARRO ACELERADO COM SUCESSO\n");
                    } else if (quantCarros == carros.size()) {
                        System.out.println("\nCARRO NAO ENCONTRADO\n");
                    } else if (quantCarros == carros.size() && carros.size() == 0) {
                        System.out.println("\nNAO HA CARROS CADASTRADOS\n");
                        
                    }
                }

                    break;

                case 5:
                    System.out.println("\nSAINDO...");
                    break;

                default:
                    System.out.println("\nOPCAO INVALIDA\n");
                    break;
            }
        } while (opcao != 5);
        
    }
}
