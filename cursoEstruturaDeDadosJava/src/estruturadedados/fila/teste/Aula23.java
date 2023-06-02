
package estruturadedados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        //Queue para garantir padrão FIFO
        
        fila.add(1); //enqueue
        fila.add(2); 
        fila.add(3); 
        
        System.out.println(fila);
        
        System.out.println(fila.peek()); //espiar
        
        System.out.println(fila.remove()); //dequeue - desenfileirar
        
        System.out.println(fila);
            
        
    }
}
