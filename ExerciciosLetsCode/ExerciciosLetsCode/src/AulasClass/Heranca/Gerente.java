package AulasClass.Heranca;

public class Gerente extends Empregado{

    final private String _cargo = "Gerente";

    private int _contEmpregados;
    private Empregado[] _subordinados;

    public String get_cargo() {
        return _cargo;
    }

    public int get_contEmpregados() {
        return _contEmpregados;
    }

    public void set_contEmpregados(int contEmpregados) {
        this._contEmpregados = contEmpregados;
    }

    public Empregado[] get_subordinados() {
        return _subordinados;
    }

    public void set_subordinados(Empregado[] subordinados) {
        this._subordinados = subordinados;
    }

    public Gerente(String nome, String sobreNome, String matricula, double salario) {
        super(nome, sobreNome, matricula, salario);
        this._subordinados = new Empregado[10];
        super._salario =  get_salario() + get_salario()* 1.2;

    }

    public Gerente() {
    }


    public String toString() {
        return "\nEmpregado{" +
                "\nnome=" + get_nome() +
                "\nsobreNome=" + get_sobreNome() +
                "\nmatricula=" + get_matricula() +
                "\nsalario=" + get_salario() +
                "\ncargo='" + get_cargo() +
                "\n}";
    }

    @Override
    public void baterPontoEntrada(){
        System.out.printf("\n%s - %s está trabalhando... ", get_cargo(),get_nome());
    }
    @Override
    public void baterPontoSaida(){
        System.out.printf("\n%s - %s bateu o ponto de saída",get_cargo(), get_nome());
    }

    public void contratar (Empregado novoEmpregado) {
        this._subordinados[_contEmpregados] = novoEmpregado;
        this._contEmpregados++;
    }
    public void demitir (int indiceEmpregado) {
        this._subordinados[indiceEmpregado] = null;
        this._contEmpregados--;
    }
}
