package ExercicioPagamento.caixa;

import ExercicioPagamento.impressao.Impressora;
import ExercicioPagamento.pagamento.Cartao;
import ExercicioPagamento.pagamento.Operadora;

public class CheckOut {
    //Finalizar a compra após ela ser autorizada pelo cartão
    // Ela vai ter um metodo de fechar a compra que vai receber uma compra e um cartao

    private Operadora _operadora;
    private Impressora _impressora;

    public Operadora get_operadora() {
        return _operadora;
    }

    public void set_operadora(Operadora operadora) {
        this._operadora = operadora;
    }

    public Impressora get_impressora() {
        return _impressora;
    }

    public void set_impressora(Impressora impressora) {
        this._impressora = impressora;
    }

    public CheckOut(Operadora operadora, Impressora impressora) {
        this._operadora = operadora;
        this._impressora = impressora;
    }


    //Para fechar a compra é preciso receber uma compra e um cartao
    //alem de verificar se ele esta autorizado ou nao

    public void fecharCompra(Compra compra, Cartao cartao ){
        boolean autorizado = this._operadora.autorizarCartao(compra, cartao);

        if(autorizado){ //conteudo  autorizado = true  ou !autorizado = false;
            this._impressora.imprimir(compra);

        }else{
            System.out.println("Compra Não Autorizado");
        }
    }


    // Se autorizado, eu posso imprimir um documento imprimivel
    //(alguem que segue o contrato!). Como "compra" tem implementacao
    //da interface Imprimivel, eu tambem posso passar "compra" como documento imprimivel.




}
