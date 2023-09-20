package domain;

public class Pessoa {
    private Integer id;
    private String email;
    public String nome;
    public TipoPessoa TipoPessoas;
    public Pessoa(Integer id, String email, String nome, TipoPessoa tipoPessoas) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        TipoPessoas = tipoPessoas;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public TipoPessoa getTipoPessoas() {
        return TipoPessoas;
    }
    public void setTipoPessoas(TipoPessoa tipoPessoas) {
        TipoPessoas = tipoPessoas;
    }
    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", email=" + email + ", nome=" + nome + ", TipoPessoas=" + TipoPessoas + "]";
    }
    
    
    
}