package cursoestruturadedadosjava.teste;

import java.util.ArrayList;

public class Aula12ArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> arryList = new ArrayList<String>();
        
        arryList.add("A");
        arryList.add("C");
        
        System.out.println(arryList);
        
        arryList.add(1, "B");
        
        System.out.println(arryList);
        
        boolean existe = arryList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no array");
        }else{
            System.out.println("Elemento não existe no array");
        }
        
        int pos = arryList.indexOf("D");
        if (pos > -1) {
            System.out.println("Elemento existe no array " + pos);
        }else{
            System.out.println("Elemento não existe no array " + pos);
        }
        
        System.out.println(arryList.size());
        
        System.out.println(arryList.get(2));
        //System.out.println(arryList.get(4));
        
        arryList.remove(1);
        arryList.remove("C");
        
        System.out.println(arryList);
    }
}
