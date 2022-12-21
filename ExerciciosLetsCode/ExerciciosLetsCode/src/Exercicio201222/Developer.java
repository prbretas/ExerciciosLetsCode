package Exercicio201222;

public class Developer extends Pessoa {
    // ------------------------------  ATRIBUTOS -------------------------------------------
    private String _cargo = "Developer";

    private double _salario;
    private double _horas;

    // ------------------------------  GET E SET -------------------------------------------

    public String get_cargo() {
        return _cargo;
    }

    /*
        public void set_cargo(String cargo) {
            this._cargo = cargo;
        }
    */
    public double get_horas() {
        return _horas;
    }

    public void set_horas(double horas) {
        this._horas = horas;
    }
// ------------------------------  CONSTRUTOR -------------------------------------------


    public Developer(String nome, String telefone, String dataAdmissional, double horas) {
        super(nome, telefone, dataAdmissional);
        this._horas = horas;
    }

    public Developer() {

    }

    //------------------------------- TO STRING -------------------------------------

    @Override
    public String toString() {
        return "\n- Developer{" +
                "\nNome: " + getNome() +
                "\nTelefone: " + getTelefone() +
                "\nData Admissional: " + getDataAdmissional() +
                "\nCargo: " + get_cargo() +
                "\nQuantidade de horas diárias: " + get_horas() +
                "\nSalário: " + calcSalario() +
                "\n}\n";
    }

    // ------------------------------  METODOS -------------------------------------------
    public double calcSalario() {
        double salario = _horas * 255;
        return salario;
    }

    public void calcSalarioVoid() {
        double salario = _horas * 255;
        System.out.println("O salário do Desenvolvedor é: " + salario);

    }
}
