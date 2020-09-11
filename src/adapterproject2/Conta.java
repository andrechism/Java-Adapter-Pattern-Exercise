package adapterproject2;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    List<Transacao> transacoes = new ArrayList<Transacao>();
    private int id;
    private double saldo = 0;
    
    public Conta(int id){
        this.id = id;
        this.saldo = 0;
    }
    
    public int getId(){
        return id;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositarSaldo(double valor){
        this.saldo += valor;
    }
    
    public void cadastrarTransacao(Transacao transacao){
        this.transacoes.add(transacao);
    }
}
