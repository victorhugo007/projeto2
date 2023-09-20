package domain;

import java.util.Date;

public class Processo {
    private String numero;
    private String tribunal;
    private String vara;
    private Date dataAbertura;
    public Date dataConclusão;
    public String cliente;
    
    public Processo(String numero, String tribunal, String vara, Date dataAbertura, Date dataConclusão,
            String cliente) {
        this.numero = numero;
        this.tribunal = tribunal;
        this.vara = vara;
        this.dataAbertura = dataAbertura;
        this.dataConclusão = dataConclusão;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getVara() {
        return vara;
    }

    public void setVara(String vara) {
        this.vara = vara;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataConclusão() {
        return dataConclusão;
    }

    public void setDataConclusão(Date dataConclusão) {
        this.dataConclusão = dataConclusão;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Processo [numero=" + numero + ", tribunal=" + tribunal + ", vara=" + vara + ", dataAbertura="
                + dataAbertura + ", dataConclusão=" + dataConclusão + ", cliente=" + cliente + "]";
    }

    


    
}
