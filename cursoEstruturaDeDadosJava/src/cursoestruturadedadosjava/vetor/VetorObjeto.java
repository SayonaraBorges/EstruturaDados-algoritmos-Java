package cursoestruturadedadosjava.vetor;

public class VetorObjeto {

    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;

    }

    public boolean adicionar(Object elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(int posicao, Object elemento) {
        this.aumentarCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

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

    public int tamanho() {
        return this.tamanho;
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
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
