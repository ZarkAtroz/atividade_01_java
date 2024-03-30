public class Jogador {

    String nome;
    int nivel;
    int pts_xp;

    public Jogador(String nome, int nivel, int pts_xp) {
        this.nome = nome;
        this.nivel = nivel;
        this.pts_xp = pts_xp;
    }

    public void atualizarNivel(int nivel) {
        this.nivel = nivel;
    }

    public void atualizarPtsXp(int pts_xp) {
        this.pts_xp = pts_xp;
    }

    public void removerPerfil() {
        this.nome = null;
        this.nivel = 0;
        this.pts_xp = 0;
    }

    public String toString() {
        return "Nome: " + this.nome + " | Nivel: " + this.nivel + " | Pontos de Experiencia: " + this.pts_xp;
    }
    
}
