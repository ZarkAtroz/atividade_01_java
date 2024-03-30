import java.util.List;
import java.util.ArrayList;

public class Agenda {
    List<Contato> contatos = new ArrayList<Contato>();

    //contatos pre existentes
    /*public Agenda() {
        contatos.add(new Contato("João", "1234-5678"));
        contatos.add(new Contato("Maria", "8765-4321"));
        contatos.add(new Contato("José", "4321-5678"));
        contatos.add(new Contato("Ana", "8765-1234"));
    }*/

    //menu
    public void exibirMenu() {
        System.out.println("[1] ADICIONAR CONTATO");
        System.out.println("[2] REMOVER CONTATO");
        System.out.println("[3] LISTAR CONTATOS");
        System.out.println("[4] BUSCAR CONTATO");
        System.out.println("[5] SAIR");
    }

    //metodos
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public void listarContatos() {
        System.err.println("LISTA DE CONTATOS:");
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + " - " + contato.getTelefone());
        }
    }

    public Contato buscarContato(String nome) {
        int index = 0;
        for (Contato contato : contatos) {
            index++;
            if (contato.getNome().equals(nome)) {
                System.out.println(contato.getNome() + " - " + contato.getTelefone());
                return contato;
            } else if (index == contatos.size()) {
                System.out.println("CONTATO NÃO ENCONTRADO!");
            }
        }

        return null;
    }
    
}
