package AULA201222;

public class Pessoa {
    //private String idade;
    //private String documento;
    //private Date dataNasc;

    private String _nomeAluno;
    private String _matricula;


    public String get_nomeAluno() {
        return _nomeAluno;
    }

    public void set_nomeAluno(String nomeAluno) {
        this._nomeAluno = nomeAluno;
    }

    public String get_matricula() {
        return _matricula;
    }

    public void set_matricula(String matricula) {
        this._matricula = matricula;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "_nomeAluno='" + _nomeAluno + '\'' +
                ", _matricula='" + _matricula + '\'' +
                '}';
    }




}
