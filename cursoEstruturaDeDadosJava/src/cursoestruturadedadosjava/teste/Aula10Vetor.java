package cursoestruturadedadosjava.teste;

import cursoestruturadedadosjava.vetor.VetorObjeto;

public class Aula10Vetor {
    public static void main(String[] args) {
        VetorObjeto vetoro = new VetorObjeto(3);
        
        Contato c1 = new Contato("Contato 1", "84 9999-8812","contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "84 9999-8834","contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "84 9999-8856","contato3@gmail.com");
        
        vetoro.adicionar(c1);
        vetoro.adicionar(c2);
        vetoro.adicionar(c3);
        
        System.out.println("Tamanho = "+vetoro.tamanho());
        
        int pos = vetoro.busca(c1);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor.");
        }else{
            System.out.println("Elemento não existe no vetor");
        }
         
        
        System.out.println(vetoro);
        
    }
         
}
