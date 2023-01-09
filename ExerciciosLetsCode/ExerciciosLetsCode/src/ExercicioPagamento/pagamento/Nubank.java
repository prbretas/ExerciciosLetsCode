package ExercicioPagamento.pagamento;

import ExercicioPagamento.impressao.Imprimivel;

public class Nubank implements Operadora {


    public boolean autorizarCartao(Autorizacao autorizacao, Cartao cartao) {
        return cartao.get_numeroCartao().startsWith("123") &&
                autorizacao.getValorCompra() < 500;
    }

}
