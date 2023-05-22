package estruturadedados.pilha.labs;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack(); 
        //usa a classe linkedList, um tipo de pilha dinâmica, portanto nao é necessario
        //definir capacidade
        
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
        
        System.out.println("Pilha de livros criada. A pilha está vazia?" + pilha.isEmpty());
        
        System.out.println("Empilhando livros na pilha: ");
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);
        
        System.out.println( pilha.size() + " livros foram pushdos.");
        System.out.println(pilha);
        
        System.out.println("Pilha de livros criada. A pilha está vazia?" + pilha.isEmpty());
        
        System.out.println("Espiando o topo da pilha: " + pilha.peek());
        
        System.out.println("Despushndo livros da pilha...");
        
        while(!pilha.isEmpty()){
            System.out.println("Despushndo livro: " + pilha.pop());
        }
        System.out.println("Todos os livros foram despushdos, pilha vazia: " + pilha.isEmpty());
        
    }
}
