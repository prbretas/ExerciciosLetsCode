package AulasClass.Heranca;


public abstract class Empregado {

    private String _nome;
    private String _sobreNome;
    private String _matricula;
    protected double _salario;

    public String get_nome() {
        return _nome;
    }
    public void set_nome(String nome) {
        this._nome = nome;
    }

    public String get_sobreNome() {
        return _sobreNome;
    }

    public void set_sobreNome(String _sobreNome) {
        this._sobreNome = _sobreNome;
    }

    public String get_matricula() {
        return _matricula;
    }
    public void set_matricula(String matricula) {
        this._matricula = matricula;
    }
    public double get_salario() {
        return _salario;
    }
    public void set_salario(double salario) {
        this._salario = salario;
    }

    public Empregado(String nome, String sobreNome, String matricula, double salario){
        this._nome= nome;
        this._sobreNome = sobreNome;
        this._matricula = matricula;
        this._salario = salario;
    }

    public Empregado(){

    }

    @Override
    public String toString() {
        return "\nEmpregado{" +
                "\nnome=" + get_nome() +
                "\nsobreNome=" + get_sobreNome() +
                "\nmatricula=" + get_matricula() +
                "\nsalario=" + get_salario() +
                "\n}";
    }

    public void baterPontoEntrada(){
        System.out.printf("\n%s está trabalhando... ", get_nome());
    }

    public void baterPontoSaida(){
        System.out.printf("\n%s bateu ponto de saída", get_nome());
    }


}
