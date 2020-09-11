package adapterproject2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Conta> listaContas = new ArrayList<Conta>();
        
        for(Conta a : listaContas){
            System.out.println("id: " + a.getId());
        }
        new Menu(listaContas);
    }
    
}
