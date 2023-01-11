package ExercicioPagamento;

//Repositorio Prof. Anderson
//https://github.com/andersonvieirarj/Funcionario
//https://github.com/andersonvieirarj/Pagamento

//Repositorio Pagamento
//https://drive.google.com/file/d/1I5cWRIuqZGt2_lwPeFzE1rVUnycIjZSe/view

/*
Exercício sobre Interfaces:

Simular uma aplicação que simule uma venda de um produto no caixa.
É necessário criar algumas interfaces: IMPRESSORA, IMPRIMÍVEL, OPERADORA, e AUTORIZAÇÃO.
Crie uma classe CARTÃO para armazenar os dados do cartão, e uma classe COMPRA
para implementar algumas interfaces

A classe CHECKOUT deve fechar a compra, verificando o cartão e a compra
A classe PRINCIPAL deve instanciar o cliente, o produto, valor e realizar o CHECKOUT
*/

import ExercicioPagamento.caixa.CheckOut;
import ExercicioPagamento.caixa.Compra;
import ExercicioPagamento.impressao.Impressora;
import ExercicioPagamento.impressao.Imprimivel;
import ExercicioPagamento.impressao.impressora_hp;
import ExercicioPagamento.pagamento.Autorizacao;
import ExercicioPagamento.pagamento.Cartao;
import ExercicioPagamento.pagamento.Nubank;
import ExercicioPagamento.pagamento.Operadora;

public class Application {
    public static void main(String[] args) {

        //Para testar precisamos instaciar uma OPERADORA, IMPRESSORA
        //CARTAO DO CLIENTE, COMPRA e CHECKOUT

        Operadora operadora = new Nubank();

        Impressora impressora = new impressora_hp();

        Cartao cartao = new Cartao();
        cartao.set_numeroCartao("1236.6399.5237.7459");
        cartao.set_nomeCliente("Joao da Silva");

        Compra compra = new Compra();
        compra.set_nomeCliente("Joao da Silva");
        compra.set_nomeProduto("Teclado Gamer RedDragon");
        compra.set_valorCompra(298.98);


        Compra compra2 = new Compra();
        compra2.set_nomeCliente(compra.get_nomeCliente());
        compra2.set_nomeProduto("Mouse Gamer Red Dragon");
        compra2.set_valorCompra(500);


        //Finalizando a compra do produto
        CheckOut checkout = new CheckOut(operadora, impressora);
        checkout.fecharCompra(compra, cartao);

        checkout.fecharCompra(compra2, cartao);

    }
}
