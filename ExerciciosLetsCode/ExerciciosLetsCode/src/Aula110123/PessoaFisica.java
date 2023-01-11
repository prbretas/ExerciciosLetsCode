package Aula110123;

public class PessoaFisica implements Pessoa {

    private String _nome;
    private String _cpf;
    private int _idade;
    private double _peso;
    private String _sexo;

    //------------------------------------------------------------
    public String get_cpf() {
        return _cpf;
    }

    public void set_cpf(String cpf) {
        this._cpf = cpf;
    }

    public int get_idade() {
        return _idade;
    }

    public void set_idade(int idade) {
        this._idade = idade;
    }

    public double get_peso() {
        return _peso;
    }

    public void set_peso(double peso) {
        this._peso = peso;
    }

    public String get_sexo() {
        return _sexo;
    }

    public void set_sexo(String sexo) {
        this._sexo = sexo;
    }

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String nome) {
        this._nome = nome;
    }


//------------------------------------------------------------


    public void andar() {
        System.out.println("Andando...");
    }

    public void dormir() {
        System.out.println("Dormindo...");
    }

    public void comer() {
        System.out.println("Comendo...");
    }

    public void respirar() {
        System.out.println("Respirando...");
    }


    @Override
    public void pagarImposto(double pagamento) {
        System.out.println("PESSOA FISICA");
        System.out.println("Pagando imposto de R$" + pagamento);
    }


    public PessoaFisica(String _nome, String _cpf, int _idade, double _peso, String _sexo) {
        this._nome = _nome;
        this._cpf = _cpf;
        this._idade = _idade;
        this._peso = _peso;
        this._sexo = _sexo;
    }

    public PessoaFisica() {
    }

}
