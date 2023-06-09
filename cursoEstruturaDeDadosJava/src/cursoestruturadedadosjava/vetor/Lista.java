package cursoestruturadedadosjava.vetor;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[])new Object[capacidade]; //casting para o tipo que precisamos
        this.tamanho = 0;
    }
    
    public boolean adicionar(T elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adicionar(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentarCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;

    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }
    
    public void remove(T elemento){
        //ver se o elemento existe no vetor
        int pos = this.busca(elemento);
        if (pos >-1) {
            this.remove(pos);
        }
    }
    
    public void limpar(){
        //opcao 1
        //this.elementos = (T[])new Object[this.elementos.length];
        
        //opcap2
        //this.tamanho=0;
        
        //opcao 3
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i]=null;
        }
        this.tamanho=0;
    }

    public int tamanho() {
        return this.tamanho;
    }
    
    public T obtem (int posicao){
        return this.busca(posicao);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean contem(T elemento){
        /*int pos = busca(elemento);
        if (pos > -1){
            return true;
        }
        return false;*/
        return busca(elemento)>-1;
    }
    public int ultimoIndice(T elemento){
        for (int i = this.tamanho-1; i >=0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    

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

}
