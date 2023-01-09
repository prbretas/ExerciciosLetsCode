package Aula090123;


// Necessito ter metodos de calculo de salario diferente para cada tipo de funcionario
public class Gerente  extends Funcionario {
    private String salario;


    @Override
    public void atualizar(int id) {
        System.out.println("Atualizando");
    }

    @Override
    public void criar(String nome) {
        System.out.println("Criando");
    }

    @Override
    public void deletar(int id) {
        System.out.println("Deletando...");

    }

    @Override
    public void salvar(String nome) {
        System.out.println("Salvando...");

    }

}
