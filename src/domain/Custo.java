package domain;

public class Custo {
    private String data;
    private String descrição;
    private String valor;
    private Processo Processo;
    public Custo(String data, String descrição, String valor, domain.Processo processo) {
        this.data = data;
        this.descrição = descrição;
        this.valor = valor;
        Processo = processo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Processo getProcesso() {
        return Processo;
    }
    public void setProcesso(Processo processo) {
        Processo = processo;
    }
    @Override
    public String toString() {
        return "Custo [data=" + data + ", descrição=" + descrição + ", valor=" + valor + ", Processo=" + Processo + "]";
    }

    
    


}
