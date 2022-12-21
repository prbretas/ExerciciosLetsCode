package Faculdade;

public abstract class Pessoa {
    //private String idade;
    //private String documento;
    //private Date dataNasc;
    //------------------------ ATRIBUTOS ---------------------------------------
    private String _nomeAluno;
    private String _matricula;

    // ------------------------ GET E SET --------------------------------------------
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

    // ------------------------ CONSTRUCTOR --------------------------------------------
    public Pessoa(String _nomeAluno, String _matricula) {
        this._nomeAluno = _nomeAluno;
        this._matricula = _matricula;
    }

    public Pessoa() {

    }

    // ------------------------ STRING --------------------------------------------
    @Override
    public String toString() {
        return "Pessoa{" +
                "_nomeAluno='" + _nomeAluno + '\'' +
                ", _matricula='" + _matricula + '\'' +
                '}';
    }

}
