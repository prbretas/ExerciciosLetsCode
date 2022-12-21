package Faculdade;

public class AlunoUniville extends Pessoa {
    // ------------------------ ATRIBUTOS --------------------------------------------
    private double _prova1;
    private double _prova2;
    private double _prova3;
// ------------------------ GET E SET --------------------------------------------

    public double get_prova1() {
        return _prova1;
    }

    public void set_prova1(double prova1) {
        this._prova1 = prova1;
    }

    public double get_prova2() {
        return _prova2;
    }

    public void set_prova2(double prova2) {
        this._prova2 = prova2;
    }

    public double get_prova3() {
        return _prova3;
    }

    public void set_prova3(double prova3) {
        this._prova3 = prova3;
    }


//------------------------ CONSTRUCTOR --------------------------------------
    public AlunoUniville() {

    }
    public AlunoUniville(String nome, String matricula, double prova1, double prova2, double prova3) {
        super.set_nomeAluno(nome);
        super.set_matricula(matricula);
        this._prova1 = prova1;
        this._prova2 = prova2;
        this._prova3 = prova3;
    }
    public AlunoUniville (double prova1){
        this._prova1 = prova1;
    }


// ------------------------ STRING --------------------------------------------

    @Override
    public String toString() {
        return "Aluno Univille: {" +
                "\nProva 1 = " + _prova1 +
                ",\nProva 2 = " + _prova2 +
                ",\nProva 3 = " + _prova3 +
                '}' +
                "\nMedia = " + calcMedia();
    }

    // ------------------------ METODOS --------------------------------------------
    public double calcMedia() {
        double media = (_prova1 + (_prova2 * 2) + (_prova3) * 3) / 6;
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Você está Reprovado");
        }
        return media;
    }

}