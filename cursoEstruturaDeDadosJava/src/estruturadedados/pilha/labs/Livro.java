package estruturadedados.pilha.labs;
public class Livro {
    private String titulo;
    private String isbn;
    private int ano;
    private String autor;

    public Livro() {
        super();
    }
    
    public Livro(String titulo, String isbn, int ano, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nLivro{" + "titulo=" + titulo + ", isbn=" + isbn + ", ano=" 
                + ano + ", autor=" + autor + '}';
    }
    
    
}
