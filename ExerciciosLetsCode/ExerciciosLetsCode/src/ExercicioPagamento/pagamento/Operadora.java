package ExercicioPagamento.pagamento;

public interface Operadora {
    //Não sei qual é a operadora do cartao
    //Precisa saber se ela vai autorizar a compra ou nao

    public boolean autorizarCartao(Autorizacao autorizacao, Cartao cartao);


}
