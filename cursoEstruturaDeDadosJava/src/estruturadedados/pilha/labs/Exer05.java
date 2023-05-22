package estruturadedados.pilha.labs;

import estruturadedados.pilha.Pilha;

public class Exer05 {

    public static void main(String[] args) {
        
        imprimeResultado("ADA");
        
        imprimeResultado("ABCD");
        
        imprimeResultado("Ana");
        
        imprimeResultado("Osso");
        
        imprimeResultado("SocorrammeSubiNoonibusEmMarrocos");
    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é palindromo?? " + testePalindromo(palavra));
    }
    
    public static boolean testePalindromo(String palavra) {

        Pilha<Character> pilha = new Pilha<>();
        
        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }
        
        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }
        
        return palavraInversa.equalsIgnoreCase(palavra);

    }
}
