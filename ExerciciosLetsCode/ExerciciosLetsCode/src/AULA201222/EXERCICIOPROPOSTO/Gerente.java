package AULA201222.EXERCICIOPROPOSTO;

import java.sql.SQLOutput;

public class Gerente extends Pessoa {
    // ------------------------------  ATRIBUTOS -------------------------------------------
    private String _cargo = "Gerente";
    private double _salarioBase;
    private double _horas;
    private double _dias;
    // ------------------------------  GET E SET -------------------------------------------

    public String get_cargo() {
        return _cargo;
    }


    public void set_cargo(String cargo) {
        this._cargo = cargo;
    }

    public double get_salarioBase() {
        return _salarioBase;
    }

    public void set_salarioBase(double salarioBase) {
        this._salarioBase = salarioBase;
    }

    public double get_horas() {
        return _horas;
    }

    public void set_horas(double horas) {
        this._horas = horas;
    }

    public double get_dias() {
        return _dias;
    }

    public void set_dias(double dias) {
        this._dias = dias;
    }
    // ------------------------------  CONSTRUTOR -------------------------------------------

    public Gerente() {

    }

    public Gerente(String nome, String telefone, String dataAdmissional, double salarioBase, double horas, double dias) {
        super(nome, telefone, dataAdmissional);
        this._salarioBase = salarioBase;
        this._horas = horas;
        this._dias = dias;
    }

    public double calcSalario() {
        double salario = _salarioBase * _horas * _dias;
        return salario;
    }

    public void calcSalarioVoid() {
        double salario = _salarioBase * _horas * _dias;
        System.out.println("O salário do Gerente é: " + salario);
    }

    // --------------------- TO STRING ----------------------------------------


    @Override
    public String toString() {
        return "\n- Gerente{" +
                "\nNome: " + getNome() +
                "\nTelefone: " + getTelefone() +
                "\nData Admissional: " + getDataAdmissional() +
                "\nCargo: " + get_cargo() +
                "\nSalario Base: " + get_salarioBase() +
                "\nQuantidade de horas diárias: " + get_horas() +
                "\nQuantidade de dias: " + get_dias() +
                "\nSalário: " + calcSalario() +
                "\n}\n";

    }

}
