package adapterproject2;

import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Conta> listaContas;
    Scanner input = new Scanner(System.in);
    boolean onWhile = true;
    
    public Menu(List<Conta> listaContas){
        this.listaContas = listaContas;
        menuConta();        
    }
    
    public void menuConta(){
        do{
            onWhile = true;
            System.out.println("______________"
                    + "\n1 - Selecionar Conta"
                    + "\n2 - Criar Conta"
                    + "\n3 - Sair");

            char op = input.next().charAt(0);
        
        
            switch(op){
                case '1':
                    selecionarConta();
                    break;
                case '2':
                    criarConta();
                    break;
                case '3':
                    onWhile = false;
            }
            op = '0';
        }while(onWhile);
        
        /*
        System.out.println("______________"
                + "\n1 - Saldo"
                + "\n2 - Depositar via Boleto"
                + "\n3 - Depósito via Débito");
        
        
        switch(op){
            case '1':
                //System.out.println("Saldo: " + conta.getSaldo());
                break;
            case '2':
                //new DepositarBoleto(conta, "123123", 55.5);
                break;
            case '3':
                break;
        }
        */
    }
    
    public void selecionarConta(){
        for(Conta c : listaContas){
            System.out.println(listaContas.indexOf(c) + " - ID Conta: " + c.getId());
        }
        System.out.print("Selecione a Conta: ");
        int contaIndex = input.nextInt();
        menuConta(listaContas.get(contaIndex));
    }
    
    public void criarConta(){
        System.out.print("idConta: ");
        int ID = input.nextInt();
        listaContas.add(new Conta(ID));
    }
    
    public void menuConta(Conta conta){
        do{
            
            String codigo = "";
            Double valor = 0.0;
            onWhile = true;
            System.out.println("_________"
                + "\n1 - Depositar por Boleto"
                + "\n2 - Depositar por Débito"
                + "\n3 - Saldo"
                + "\n4 - Transações"
                + "\n5 - Voltar");
        
            char op = input.next().charAt(0);
            switch(op){
                case '1':
                    System.out.println("Digite o código do Boleto: ");
                    codigo = input.next();
                    System.out.println("Digite o valor a ser Depositado (ex: 10,5 ):  ");
                    valor = input.nextDouble();
                    new DepositarBoleto(conta, codigo, valor);
                    break;
                case '2':
                    System.out.println("Digite a transação Débito processada: ");
                    codigo = input.next();
                    System.out.println("Digite o valor a ser Depositado (ex: 10,5 ):  ");
                    valor = input.nextDouble();
                    new DepositarDebito(conta, codigo, valor);
                    break;
                case '3':
                    System.out.println("Saldo: " + conta.getSaldo());
                    break;
                case '4':
                    if(conta.transacoes.isEmpty()) System.out.println("Não houve transações nesta conta!");
                    for(Transacao t : conta.transacoes){
                        System.out.println(conta.transacoes.indexOf(t) + " - " + t.getTransacao() + " - Valor: " + t.getValor());
                    }
                    break;
                case '5':
                    onWhile = false;
            }
        }while(onWhile);
        onWhile = true;
    }
}
