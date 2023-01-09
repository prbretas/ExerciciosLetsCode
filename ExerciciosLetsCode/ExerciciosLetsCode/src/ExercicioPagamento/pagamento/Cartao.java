package ExercicioPagamento.pagamento;

public class Cartao {
    //Aqui, essa classe trata das info basicas do cartao do cliente,
    //que devem ser repassadas para as interfaces
    //a interface operadora é quem vai dizer se a compra desse cartao e valida ou nao

    private String _nomeCliente;
    private String _numeroCartao;


    public String get_nomeCliente() {
        return _nomeCliente;
    }

    public void set_nomeCliente(String nomeCliente) {
        this._nomeCliente = nomeCliente;
    }

    public String get_numeroCartao() {
        return _numeroCartao;
    }

    public void set_numeroCartao(String numeroCartao) {
        this._numeroCartao = numeroCartao;
    }



}
