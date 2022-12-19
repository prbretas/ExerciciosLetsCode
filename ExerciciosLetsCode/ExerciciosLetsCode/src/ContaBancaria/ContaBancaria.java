package ContaBancaria;

public class ContaBancaria {

    private String _nome;
    private String NumConta;
    private double _saldo;
    private double _debito;
    private double _credito;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String getNumConta() {
        return NumConta;
    }

    public void setNumConta(String numConta) {
        NumConta = numConta;
    }

    public double get_saldo() {
        return _saldo;
    }

    public void set_saldo(double _saldo) {
        this._saldo = _saldo;
    }

    public double get_debito() {
        return _debito;
    }

    public void set_debito(double _debito) {
        this._debito = _debito;
    }

    public double get_credito() {
        return _credito;
    }

    public void set_credito(double _credito) {
        this._credito = _credito;
    }



// VOID
    public void mostrarSaldoVoid() {
        _saldo = 0;
        System.out.println("O saldo da conta é: " + _saldo);
    }

    public double mostrarSaldo(){
        _saldo = 0;
        return _saldo;
    }

    public double calcularCredito(){
        _saldo += _credito;
        return _saldo;
    }

    public double calcularDebito(){
        _saldo -= _debito;
        return _saldo;
    }






}
