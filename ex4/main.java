import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> perfis = new ArrayList<Jogador>();

        int opcao;

        String nome;

        do {
            
            System.out.println(">>>GERENCIADOR DE PERFIS<<<");
            System.out.println("[1] CRIAR PERFIL");
            System.out.println("[2] ATUALIZAR NIVEL");
            System.out.println("[3] ATUALIZAR PONTOS DE EXPERIENCIA");
            System.out.println("[4] REMOVER PERFIL");
            System.out.println("[5] LISTAR PERFIS");
            System.out.println("[6] SAIR");
            System.err.print("==>OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do jogador: ");
                    nome = scanner.next();

                    System.out.print("Digite o nivel do jogador: ");
                    int nivel = scanner.nextInt();

                    System.out.print("Digite os pontos de experiencia do jogador: ");
                    int pts_xp = scanner.nextInt();

                    Jogador jogador = new Jogador(nome, nivel, pts_xp);

                    perfis.add(jogador);

                    System.out.println("\nPERFIL CRIADO COM SUCESSO!\n");
                    
                    break;

                case 2:
                    System.out.println("\nInforme o nome do jogador: ");
                    nome = scanner.next();

                    for (int i = 0; i < perfis.size(); i++) {
                        if (perfis.get(i).nome.equals(nome)) {
                            System.out.print("Digite o novo nivel do jogador: ");
                            int novoNivel = scanner.nextInt();

                            perfis.get(i).atualizarNivel(novoNivel);

                            System.out.println("\nNIVEL ATUALIZADO COM SUCESSO!\n");

                        } else {
                            System.out.println("\nJOGADOR NAO ENCONTRADO!\n");
                        }
                    }
                    
                    break;

                case 3:
                    System.out.println("\nInforme o nome do jogador: ");
                    nome = scanner.next();

                    for (int i = 0; i < perfis.size(); i++) {
                        if (perfis.get(i).nome.equals(nome)) {
                            System.out.print("Digite os novos pontos de experiencia do jogador: ");
                            int novosPtsXp = scanner.nextInt();

                            perfis.get(i).atualizarPtsXp(novosPtsXp);

                            System.out.println("\nPONTOS DE EXPERIENCIA ATUALIZADOS COM SUCESSO!\n");
                        } else {
                            System.out.println("\nJOGADOR NAO ENCONTRADO!\n");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nInforme o nome do jogador: ");
                    nome = scanner.next();

                    for (int i = 0; i < perfis.size(); i++) {
                        if (perfis.get(i).nome.equals(nome)) {
                            System.out.println("Tem certeza que deseja remover o perfil? [S/N]");
                            String confirmacao = scanner.next();
                            if (confirmacao.equals("S")) {
                                perfis.get(i).removerPerfil();
                                System.out.println("\nPERFIL REMOVIDO COM SUCESSO!\n");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("\nJOGADOR NAO ENCONTRADO!\n");
                        }
                    }
                    
                    break;

                case 5:
                    System.out.println("\n>>>LISTA DE PERFIS<<<");
                    for (int i = 0; i < perfis.size(); i++) {
                        if (perfis.size() > 0){
                            System.out.println(perfis.get(i).toString());
                        } else {
                            System.out.println("\nNENHUM PERFIL CADASTRADO!\n");
                            
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nSAINDO...");
                    break;
            
                default:
                    System.out.println("\nOPCAO INVALIDA!");
                    break;
            }
            
        } while (opcao != 6);
    }
}
