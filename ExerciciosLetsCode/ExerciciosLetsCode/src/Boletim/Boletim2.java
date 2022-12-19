package Boletim;

public class Boletim2 {

    //  --------------- ATRIBUTOS ---------------
    private String _nome;
    private String _disciplina;
    private double _nota1;
    private double _nota2;
    private double _nota3;
    private double _nota4;
    private double _media;
    //  -------------- PROPRIEDADES --------------------

    // -------------------------------------------------
    // CONSTRUÇÃO DOS METODOS ACESSORES - ACESSAR ATRIBUTOS
    // SET - METODO QUE PERMITE ALTERAR O VALOR DO ATRIBUTO (ALTERAR)
    // SEMPRE SERA VOID

    public void setNome(String nome) {
        this._nome = nome;
    }
    public void setDisciplina(String disciplina) {
        this._disciplina = disciplina;
    }
    public void setNota1(double nota1) {
        this._nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this._nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this._nota3 = nota3;
    }
    public void setNota4(double nota4) {
        this._nota4 = nota4;
    }
    public void setMedia(double media) {
        this._media = media;
    }



    //GET - METODO QUE PERMITE ACESSAR, VISUALIZAR O VALOR DO ATRIBUTO
    // SEMPRE SERA DO TIPO DO ATRIBUTO

    public String getNome(){
        return this._nome;
    }
    public String getDisciplina(){
        return this._disciplina;
    }
    public double getNota1(){
        return this._nota1;
    }
    public double getNota2(){
        return this._nota2;
    }
    public double getNota3(){
        return this._nota3;
    }
    public double getNota4(){
        return this._nota4;
    }
    public double getMedia(){
        return this._media;
    }


    //  -------------- MÉTODOS / FUNÇÕES --------------------
    // VOID - Não tem RETORNO - TEM Q SER RESOLVIDO DENTRO DO METODO
    public void calcularMediaVoid() {
        _media = (_nota1 + _nota2 + _nota3 + _nota4) / 4;
        System.out.println("VOID: A média do aluno é: " + _media);
    }

    // ESSE METODO TEM RETORNO DO TIPO DOUBLE
    public double calcularMediaReturn() {
        _media = (_nota1 + _nota2 + _nota3 + _nota4) / 4;
        return _media;
    }


}
