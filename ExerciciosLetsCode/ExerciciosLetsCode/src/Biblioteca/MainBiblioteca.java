package Biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {

//        Livro livro1 = new Livro("A casa Azul", "Joao Ninguém");
//        System.out.println(livro1.toString());
//
//
//        Livro livro2 = new Livro();
//        livro2.entradaDeDados();
//        System.out.println(livro2.toString());


        Acervo livro3 = new Acervo();
        livro3.entradaDeDados();
        System.out.println(livro3.toString());

        livro3.imprimeDados();

    }
}
