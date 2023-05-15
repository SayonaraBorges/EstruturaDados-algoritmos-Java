package estruturadedados.pilha.teste;

import estruturadedados.pilha.Pilha;

public class Aula16 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha();
        System.out.println(pilha.topo());
        System.out.println(pilha);
        
        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        
        System.out.println(pilha.topo());
        System.out.println(pilha);
        
        //aula17
        System.out.println("Desempilhando elemento "+ pilha.desempilha());
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
        System.out.println(pilha.estaVazia());
    }
            
}
