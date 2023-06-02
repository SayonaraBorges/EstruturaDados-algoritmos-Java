
package estruturadedados.fila.teste;

import estruturadedados.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        
        fila.enfileira(4);
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
        
        System.out.println(fila.toString());
        
        System.out.println(fila.espiar());
    }
}
