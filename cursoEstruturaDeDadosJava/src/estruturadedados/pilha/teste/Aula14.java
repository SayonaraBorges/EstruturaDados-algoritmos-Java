package estruturadedados.pilha.teste;

import estruturadedados.pilha.Pilha;

public class Aula14 {
    public static void main(String[] args) {
    Pilha<Integer> pilha = new Pilha();
        //aula14
        /*for (int i = 1; i <= 11; i++) {
            pilha.empilha(i);
        }
    
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
        */
        
        //aula15
        System.out.println(pilha.estaVazia());
        pilha.empilha(1);
        
        System.out.println(pilha.estaVazia());
        
        
    }   
}
