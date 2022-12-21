package Biblioteca;
import java.util.Scanner;
//CLASSE ABSTRATA - uma classe do JAVA que nao pode ser instanciada
//ou seja não é possível gerar obejtos a partir dela.
//A ideia é que sejam gerados apenas objetos das classes-filhas
//utilizar a palavra "ABSTRACT" -  no diagrama de classes estará em Itálico


public abstract class Livro {
    Scanner input = new Scanner(System.in);
    //------------------------ ATRIBUTOS ----------------------------------
    private String _nomeLivro;
    private String _autorLivro;
//------------------------ GET E SET ----------------------------------
    public String get_nomeLivro() {
        return _nomeLivro;
    }
    public void set_nomeLivro(String nomeLivro) {
        this._nomeLivro = nomeLivro;
    }
    public String get_autorLivro() {
        return _autorLivro;
    }
    public void set_autorLivro(String autorLivro) {
        this._autorLivro = autorLivro;
    }
    //------------------------ CONSTRUCTOR ----------------------------------
    public Livro(String nomeLivro, String autorLivro) {
        this._nomeLivro = nomeLivro;
        this._autorLivro = autorLivro;
    }
    public Livro() {

    }
    //------------------------ TO STRING ----------------------------------
    @Override
    public String toString() {
        return "Livro: {" +
                "\n Nome do Livro: " + _nomeLivro +
                "\n Autor do Livro: " + _autorLivro +
                "\n}";
    }
    //------------------------ METODOS ----------------------------------
    public void entradaDeDados() {
        System.out.println("Informe o nome do livro: ");
        _nomeLivro = input.nextLine();
        System.out.println("Informe o autor do livro");
        _autorLivro = input.nextLine();
    }

    public void imprimeDados() {
        System.out.println("Nome do Livro: " + get_nomeLivro());
        System.out.println("Nome do Autor: " + get_autorLivro());
    }
}
