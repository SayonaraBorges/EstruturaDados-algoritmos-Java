package cursoestruturadedadosjava.teste;

import cursoestruturadedadosjava.vetor.Lista;

public class Aula11Lista {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista(1);
        vetor.adicionar("Novo elemento");
        
        Lista<Contato> vetorContato = new Lista(1);
        Contato c1 = new Contato("Contato 1", "84 9999-8812","contato1@gmail.com");
        vetorContato.adicionar(c1);
    }
}
