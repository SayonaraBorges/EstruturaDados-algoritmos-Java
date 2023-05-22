package estruturadedados.pilha.labs;

import estruturadedados.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha(20);
        
        Livro livro1 = new Livro();
        
        livro1.setAutor("Edgar Allan Poe");
        livro1.setIsbn("6585168097");
        livro1.setAno(2023);
        livro1.setTitulo("Grandes Obras de Edgar Allan Poe - Box com 3 Livros");
        
        Livro livro2 = new Livro();
        livro2.setAutor("Junior Rostirola");
        livro2.setIsbn("6585168097");
        livro2.setAno(2022);
        livro2.setTitulo("Café com Deus Pai: Porções Diárias de Renovação");
        
        Livro livro3 = new Livro();
        livro3.setAutor("Marcelo Galuppo");
        livro3.setIsbn("6587885047");
        livro3.setAno(2021);
        livro3.setTitulo("#umdiasemreclamar: Descubra por que a gratidão pode mudar a sua vida");
        
        Livro livro4 = new Livro();
        livro4.setAutor("C.S. Lewis");
        livro4.setIsbn("857827069X");
        livro4.setAno(2009);
        livro4.setTitulo("As Crônicas de Nárnia.");
        
        Livro livro5 = new Livro();
        livro5.setAutor("George R. R. Martin");
        livro5.setIsbn("8556510787");
        livro5.setAno(2019);
        livro5.setTitulo("A Guerra dos Tronos : As Crônicas de Gelo e Fogo, volume 1");
        
        Livro livro6 = new Livro();
        livro6.setAutor("Matt Haig");
        livro6.setIsbn("6558380544");
        livro6.setAno(2021);
        livro6.setTitulo("A Biblioteca da Meia-Noite");
        
        System.out.println("Pilha de livros criada. A pilha está vazia?" + pilha.estaVazia());
        
        System.out.println("Empilhando livros na pilha: ");
        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);
        
        System.out.println( pilha.tamanho() + " livros foram empilhados.");
        System.out.println(pilha);
        
        System.out.println("Pilha de livros criada. A pilha está vazia?" + pilha.estaVazia());
        
        System.out.println("Espiando o topo da pilha: " + pilha.topo());
        
        System.out.println("Desempilhando livros da pilha...");
        
        while(!pilha.estaVazia()){
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
        
    }
}
