package Aula110123;

public class PessoaJuridica implements Pessoa{
    private String _cnpj;

    public String get_cnpj() {
        return _cnpj;
    }

    public void set_cnpj(String _cnpj) {
        this._cnpj = _cnpj;
    }

    public void contratarFuncionario(){
        System.out.println("Contratando funcionário;");
    }

public void pagarImposto(double pagamento){
    System.out.println("EMPRESA - PESSOA JURIDICA");
    System.out.println("Pagando imposto de R$" + pagamento);
    }

}
