
package estruturadedados.fila;

import estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
   public Fila(){
       super();
   }
   
   public Fila (int capacidade){
       super(capacidade);
   }
   
   public void enfileira(T elemento){
       //this.elementos[this.tamanho] = elemento;
       //this.tamanho++;
       
       //this.elementos[this.tamanho++] = elemento;
       
       this.adicionar(elemento);
   }
   final int POS = 0;
   //espia o primeiro elemento da fila
   public T espiar(){
       if(this.estaVazia()){
           return null;
       }
       return this.elementos[POS];
   }
   
   public T desenfileira(){
       
       if(this.estaVazia()){
           return null;
       }
       T elementoASerRemovido = this.elementos[POS];
       this.remove(POS);
       
       return elementoASerRemovido;
   }
}
