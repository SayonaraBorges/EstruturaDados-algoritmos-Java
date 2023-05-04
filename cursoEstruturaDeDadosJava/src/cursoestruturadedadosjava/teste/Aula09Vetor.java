package cursoestruturadedadosjava.teste;

import cursoestruturadedadosjava.vetor.Vetor;

public class Aula09Vetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        
        vetor.adicionar("B");
        vetor.adicionar("G");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");
        
        System.out.println(vetor);
        
        vetor.remove(1);
        
        System.out.println(vetor);
        
        System.out.println("Remover o elemento E");
        int pos = vetor.busca("E");
        if (pos>-1) {
            vetor.remove(pos);
        }else{
            System.out.println("Elemento não existe no vetor.");
        }
        System.out.println(vetor);
        
    }
}
