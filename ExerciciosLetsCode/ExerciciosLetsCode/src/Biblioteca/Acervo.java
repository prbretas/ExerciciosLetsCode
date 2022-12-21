package Biblioteca;

public class Acervo extends Livro {
    //------------------------ ATRIBUTOS ----------------------------------
    private int _quantidade;
    private String _editora;
    // ------------------------------  GET E SET -------------------------------------------
    public int get_quantidade() {
        return _quantidade;
    }
    public void set_quantidade(int quantidade) {
        this._quantidade = quantidade;
    }
    public String get_editora() {
        return _editora;
    }
    public void set_editora(String editora) {
        this._editora = editora;
    }

    //------------------------ CONSTRUCTOR ----------------------------------

    public Acervo(String nomeLivro, String autorLivro, int quantidade, String editora) {
        super(nomeLivro, autorLivro);
        this._quantidade = quantidade;
        this._editora = editora;
    }

    public Acervo() {

    }
    //------------------------ TO STRING ----------------------------------
    @Override
    public String toString() {
        return "Acervo{" +
                "\nNome do Livro: " + get_nomeLivro() +
                "\nAutor do Livro: " + get_autorLivro() +
                "\nQuantidade: " + _quantidade +
                "\nEditora: " + _editora +
                "\n}";
    }



    //------------------------------- METODOS ---------------------------------------


    //@OVERRIDE - SOBRESCRITA
    // SOBREPOSIÇÃO DE METODOS COM ASSINATURA E NOMES IGUAIS EM CLASSES DIFERENTES, SENDO
    //HERDADOS DA CLASSE MÃE.
    public void entradaDeDados(){
        super.entradaDeDados();
        System.out.println("Digite a quantidade de livros");
        _quantidade = input.nextInt();
        System.out.println("Informe a editora do livro: ");
        _editora = input.next();
    }

    //@OVERRIDE
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Quantidade do Livro: " + get_quantidade());
        System.out.println("Editora do Autor: " + get_editora());

    }


}
