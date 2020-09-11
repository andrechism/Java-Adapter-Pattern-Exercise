package adapterproject2;

public class Transacao {
    private String transacao;
    private Double valor;
    
    public Transacao(String transacao, Double valor){
        this.transacao = transacao;
        this.valor = valor;
    }
    
    public String getTransacao(){
        return transacao;
    }
    
    public Double getValor(){
        return valor;
    }
}
