package estruturadedados.base;
public class EstruturaEstatica<T> {
    private T[] elementos;
    private int tamanho;
    
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[])new Object[capacidade]; //casting para o tipo que precisamos
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }
    
    protected boolean adicionar(T elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }
    
    protected boolean adicionar(int posicao, T elemento) {
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
    
    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public int tamanho() {
        return this.tamanho;
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
