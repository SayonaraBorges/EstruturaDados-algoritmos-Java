package cursoestruturadedadosjava.teste;

import cursoestruturadedadosjava.vetor.Vetor;

public class Aula08Vetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");
        
        System.out.println(vetor);
        
    }
}
