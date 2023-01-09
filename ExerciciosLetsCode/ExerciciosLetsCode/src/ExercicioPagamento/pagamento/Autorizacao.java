package ExercicioPagamento.pagamento;

public interface Autorizacao {
    //Só precisa saber o valor total da compra, para ele ser autorizado ou não
    public double get_valorCompra();
}
