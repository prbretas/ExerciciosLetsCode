package AULA201222.EXERCICIOPROPOSTO;

public class Empregado extends Pessoa {

    // ------------------------------  ATRIBUTOS -------------------------------------------
    private String _cargo = "Empregado";
    private double _salario;

    private double _horas;


    // ------------------------------  GET E SET -------------------------------------------


    public String get_cargo() {
        return _cargo;
    }

    public void set_cargo(String cargo) {
        this._cargo = cargo;
    }

    public double getSalario() {
        return _salario;
    }

    public void setSalario(double salario) {
        this._salario = salario;
    }

    // ------------------------------  CONSTRUTOR -------------------------------------------


    public Empregado(String nome, String telefone, String dataAdmissional, String cargo, double salario) {
        super(nome, telefone, dataAdmissional);
        this._cargo = cargo;
        this._salario = salario;
    }


    public Empregado() {

    }


    //------------------------------- TO STRING -------------------------------------


    @Override
    public String toString() {
        return
                "-\n Empregado{" +
                        "\nNome: " + getNome() +
                        "\nTelefone: " + getTelefone() +
                        "\nData Admissional: " + getDataAdmissional() +
                        "\nCargo: " + get_cargo() +
                        "\nSalário: " + calcSalario() +
                        "\n}\n";
    }


    // ------------------------------  METODOS -------------------------------------------
    public double calcSalario() {
        double salario = _salario;
        return salario;
    }

    public void calcSalarioVoid() {
        double salario = _salario;
        System.out.println("O salário do Empregado é: " + salario);

    }


}
