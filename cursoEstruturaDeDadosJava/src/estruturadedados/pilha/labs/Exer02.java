package estruturadedados.pilha.labs;

import estruturadedados.pilha.Pilha;
import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Pilha<Integer> pilhaPar = new Pilha();
        Pilha<Integer> pilhaImp = new Pilha();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um número: ");
            int num = scan.nextInt();

            if (num == 0) {
                Integer desempilhado = pilhaPar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia!");
                } else {
                    System.out.println("Desempilhando da pilha par");
                }
                
                desempilhado = pilhaImp.desempilha();
                
                if (desempilhado == null) {
                    System.out.println("Pilha ímpar vazia!");
                } else {
                    System.out.println("Desempilhando da pilha ímpar");
                }
                
            } else if (num % 2 == 0) {
                System.out.println("Número par, empilhando o número na pilha par.");
                pilhaPar.empilha(num);
            } else {
                System.out.println("Número ímpar, empilhando o número na pilha ímpar.");
                pilhaImp.empilha(num);
            }
        }

    

    System.out.println ("Desempilhando todos os números da pilha par.");
        while (!pilhaPar.estaVazia()) {
            System.out.println("Dempilhando da pilha par: " + pilhaPar.desempilha());
        }

    System.out.println ("Desempilhando todos os números da pilha ímpar.");
        while (!pilhaImp.estaVazia()) {
            System.out.println("Dempilhando da pilha par: " + pilhaImp.desempilha());
        }
    }
}
