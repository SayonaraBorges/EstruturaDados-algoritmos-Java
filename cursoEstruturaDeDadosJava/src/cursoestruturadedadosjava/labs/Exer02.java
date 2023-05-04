package cursoestruturadedadosjava.labs;

import cursoestruturadedadosjava.vetor.Lista;
import java.util.ArrayList;
public class Exer02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList(5);
        
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");
        
        System.out.println(arrayList.lastIndexOf("A"));
        
        Lista<String> lista = new Lista(5);
        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("A");
        
        System.out.println(lista.ultimoIndice("A"));
        
        
    }
            
}
