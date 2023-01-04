package AulasClass.Encapsulamento;

public class Conta {
    private String _titular;
    private String _numeroDaConta;
    private double _saldo;


    public String get_titular() {
        return _titular;
    }

    public void set_titular(String titular) {
        this._titular = titular;
    }

    public String get_numeroDaConta() {
        return _numeroDaConta;
    }

    public void set_numeroDaConta(String numeroDaConta) {
        this._numeroDaConta = numeroDaConta;
    }

    public double get_saldo() {
        return _saldo;
    }


    public void set_saldo(double saldo) {
        if (saldo >= 0) {
            this._saldo = saldo;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public Conta(String titular, String numeroDaConta, double saldo) {
        this._titular = titular;
        this._numeroDaConta = numeroDaConta;
        this._saldo = saldo;
    }


    public void sacar(double valor) {
        double novoSaldo = get_saldo() - valor;
        set_saldo(novoSaldo);
    }

    public void transferir(double valor, Conta contaDestino) {
        double novoSaldoDaContaOrigem = get_saldo() - valor;
        double novoSaldoDaContaDestino = contaDestino.get_saldo() + valor;

        set_saldo(novoSaldoDaContaOrigem);

        contaDestino.set_saldo(novoSaldoDaContaDestino);
    }

    public void pagar(double valor) {
        double novoSaldo = get_saldo() - valor;
        set_saldo(novoSaldo);

        // suponha que tenha o resto do código para enviar o pagamento...
    }
}
