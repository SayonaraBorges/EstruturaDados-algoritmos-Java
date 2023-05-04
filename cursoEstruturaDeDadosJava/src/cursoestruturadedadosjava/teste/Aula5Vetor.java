package cursoestruturadedadosjava.teste;

import cursoestruturadedadosjava.vetor.Vetor;

public class Aula5Vetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("1- Curso");
        vetor.adicionar("2- Estrutura de Dados");
        vetor.adicionar("3- Em andamento...");
        
        System.out.println(vetor.busca(2));
        
        System.out.println(vetor.busca("1- curso")); //aula06
        
        System.out.println(vetor.busca(" ")); //aula06
        
        
    }
}
