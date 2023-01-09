package ExercicioPagamento.caixa;

import ExercicioPagamento.impressao.Imprimivel;
import ExercicioPagamento.pagamento.Autorizacao;

public class Compra implements Imprimivel, Autorizacao {
    //Alem dos dados de compra do produto, devemos implementar
    //os metodos das duas INTERFACES

    private double _valorCompra;
    private String _nomeProduto;
    private String _nomeCliente;

    public double get_valorCompra() {
        return _valorCompra;
    }

    public void set_valorCompra(double valorCompra) {
        this._valorCompra = valorCompra;
    }

    public String get_nomeProduto() {
        return _nomeProduto;
    }

    public void set_nomeProduto(String nomeProduto) {
        this._nomeProduto = nomeProduto;
    }

    public String get_nomeCliente() {
        return _nomeCliente;
    }

    public void set_nomeCliente(String nomeCliente) {
        this._nomeCliente = nomeCliente;
    }


    @Override
    public String getCabecalhoNF() {
        //mostrar o nome do cliente
        return this._nomeCliente;
    }

    @Override
    public String getCorpoNF() {
        //mostrar o produto e po valor da compra
        return this._nomeProduto + "=" + this._valorCompra;
    }


}
