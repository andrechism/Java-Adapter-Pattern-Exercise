package adapterproject2;

public class DepositarBoleto {
    private String codigo;
    private double valor;
    
    public DepositarBoleto(Conta conta, String codigo, double valor){
        conta.depositarSaldo(valor);
        conta.transacoes.add(new Transacao(codigo, valor));
    }
}
