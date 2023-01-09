package ExercicioPagamento.impressao;

public interface Impressora {
    /*
    Ela vai imprimir qualquer dociumento nao me interessando qual
    o tipo de documento esta sendo recebido.
    Todos os metodos das interfaces sao abstratos e não possuem implementacao aqui
    */

    //Este metodo vai servir para imprimir um documento da Interface IMPRIMIVEL.
    public void imprimir(Imprimivel imprimivel);


}
