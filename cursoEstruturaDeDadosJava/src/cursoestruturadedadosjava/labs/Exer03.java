package cursoestruturadedadosjava.labs;

import java.util.ArrayList;

public class Exer03 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList(5);
        
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        
        System.out.println(lista);
        
        lista.remove("A");
        
        System.out.println(lista);
        
        lista.remove("E");
        
        System.out.println(lista);
        
        lista.remove("C");
        
        System.out.println(lista);
        
    }
}
