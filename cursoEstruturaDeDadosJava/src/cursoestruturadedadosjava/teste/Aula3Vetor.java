package cursoestruturadedadosjava.teste;

import cursoestruturadedadosjava.vetor.Vetor;

public class Aula3Vetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("Curso");
        vetor.adicionar("Estrutura de Dados");
        vetor.adicionar("Em andamento...");
        vetor.tamanho();
        System.out.println(vetor.tamanho());
        System.out.println(vetor);
        
    }
    
}
