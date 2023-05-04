package cursoestruturadedadosjava.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }

    /*public void adicionar(String elemento){
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i]==null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/
 /*public void adicionar(String elemento) throws Exception{
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
        }else{
            throw new Exception("Vetor já está cheio, não é possível adicionar "
                    + "mais elementos. ");
                    
        }
        
    }*/
    public boolean adicionar(String elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }
    
    public  void adicionar(int posicao, String elemento){
        this.aumentarCapacidade();
        if (!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        //0 1 2 3 4 5 = tamanho é 5
        //B C E F G +
        //mover todos os elementos
        for (int i = this.tamanho-1; i >=posicao ; i--) {
            this.elementos[i+1]=this.elementos[i];
        }
        this.elementos[posicao]=elemento;
        this.tamanho++;
        
    }
    // B G D E F -> posicao a ser removida é 1 (G)
    // 0 1 2 3 4 -> 5 tamanho
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao){
        if (!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public int tamanho() {
        return this.tamanho;
    }

    /*@Override
    public String toString() {
        return Arrays.toString(elementos);
    }*/
    //desse forma o método retorna todos os nulls
    
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("{ ");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append(" }");

        return s.toString();
    }

    /*@Override
    public String toString(){
        String[] dados = new String[this.tamanho];
        for(int i=0; i<this.tamanho;i++){
            dados[i] = elementos[i];
        }
        return Arrays.toString(dados);
    }*/
    //outra alternativa encontrada nos comentários do vídeo.
    
    public String busca(int posicao){
        if (!(posicao >=0 && posicao < tamanho)) { 
            //encontro as posições válidas e nego tudo, assim tenho
            // as que nao podem ser usadas
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];
    }
    
    //sobrescrita de método alterando a assinatura
    public int busca(String elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    private void aumentarCapacidade(){
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length*2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
}
