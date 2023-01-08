package AulasClass.Heranca;

public class Vendedor extends Empregado {

    final private String _cargo = "Vendedor";

    public String get_cargo() {
        return _cargo;
    }

    public Vendedor(String nome, String sobreNome, String matricula, double salario) {
        super(nome, sobreNome, matricula, salario);
    }

    public Vendedor() {
    }

    @Override
    public String toString() {
        return "\nEmpregado{" +
                "\nnome=" + get_nome() +
                "\nsobreNome=" + get_sobreNome() +
                "\nmatricula=" + get_matricula() +
                "\nsalario=" + get_salario() +
                "\ncargo=" + get_cargo() +
                "\n}";
    }

    @Override
    public void baterPontoEntrada() {
        System.out.printf("\n%s - %s está trabalhando... ", this.get_cargo(), this.get_nome());
    }
    @Override
    public void baterPontoSaida() {
        System.out.printf("\n%s - %s bateu o ponto de saída", this.get_cargo(), this.get_nome());
    }

}
