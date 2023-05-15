package estruturadedados.pilha.teste;

import estruturadedados.pilha.Pilha;
import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha();

        Stack<String> stack = new Stack();
        
        System.out.println(stack.isEmpty()); //verifica status do conteúdo
        
        stack.push("A"); //empilhar
        stack.push("B");
        stack.push("C");
        
        System.out.println(stack.isEmpty()); 
        
        System.out.println(stack.size()); //retorna tamanho
        
        System.out.println(stack); //toString - imprime
        
        System.out.println(stack.peek()); //espia o topo
        
        System.out.println(stack.pop()); //remove o topo
        
        System.out.println(stack);
        
    }
}
