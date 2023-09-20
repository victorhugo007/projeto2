package domain;

public class Vara {
    private String nome;
    private Tribunal Tribunal;
    
    public Vara(String nome, domain.Tribunal tribunal) {
        this.nome = nome;
        Tribunal = tribunal;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Tribunal getTribunal() {
        return Tribunal;
    }
    public void setTribunal(Tribunal tribunal) {
        Tribunal = tribunal;
    }
    @Override
    public String toString() {
        return "Vara [nome=" + nome + ", Tribunal=" + Tribunal + "]";
    }

    

}
