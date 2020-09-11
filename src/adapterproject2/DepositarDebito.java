package adapterproject2;

public class DepositarDebito {
    public DepositarDebito(Conta conta, String transacao, Double valor){
        new DepositarBoleto(conta,"debito-" + transacao, valor);
    }
}
