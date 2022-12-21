package Exercicio201222;


public class Pessoa {

    // ------------------------------  ATRIBUTOS -------------------------------------------
    private String _nome;
    private String _telefone;
    private String _dataAdmissional;

    // ------------------------------  GET E SET -------------------------------------------

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getTelefone() {
        return _telefone;
    }

    public void setTelefone(String telefone) {
        this._telefone = telefone;
    }

    public String getDataAdmissional() {
        return _dataAdmissional;
    }

    public void setDataAdmissional(String dataAdmissional) {
        this._dataAdmissional = dataAdmissional;
    }


    // ------------------------------  CONSTRUTOR -------------------------------------------
    public Pessoa(String nome, String telefone, String dataAdmissional) {
        this._nome = nome;
        this._telefone = telefone;
        this._dataAdmissional = dataAdmissional;
    }

    public Pessoa() {

    }
// ---------------------------------- TO STRING ---------------------------------------------

    @Override
    public String toString() {
        return "\n- Pessoa: {" +
                "\nNome: " + getNome() +
                "\nTelefone: " + getTelefone() +
                "\nData Admissional: " + getDataAdmissional() +
                "\n}\n";
    }

}
