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
    public AlunoUniville(String nomeAluno, String matricula, double prova1, double prova2, double prova3) {
        super(nomeAluno,matricula);
        this._prova1 = prova1;
        this._prova2 = prova2;
        this._prova3 = prova3;
    }



// ------------------------ STRING --------------------------------------------

    @Override
    public String toString() {
        return "\nAluno Univille: {" +
                "\nProva 1 = " + get_prova1() +
                "\nProva 2 = " + get_prova2() +
                "\nProva 3 = " + get_prova3() +
                "\nMedia = " + calcMedia()+
                '}' ;
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