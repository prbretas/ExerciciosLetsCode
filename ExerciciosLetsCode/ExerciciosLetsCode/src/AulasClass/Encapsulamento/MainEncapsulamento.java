package AulasClass.Encapsulamento;

/*
 Quais benefícios do encapsulamento?
Melhor controle dos atributos internos
Os atributos da classe podem ser definidos como read-only (somente leitura), basta usar somente métodos get.
Os atributos da classe também podem ser definidos como write-only (somente escrita), basta usarmos somente os métodos set.
Nosso projeto fica mais flexível, se precisarmos de alteração a fazemos em um único lugar e nada será afetado.
 */


public class MainEncapsulamento {
    public static void main(String args[]) {

        Conta contaDaMaria = new Conta("Maria", "123", 100.0);

        Conta contaDoJose = new Conta("Jose", "456", 30.0);


        //---------------------------------------------------------------------------------
        // sacando dinheiro da conta da maria
        contaDaMaria.sacar(20.0);

        // transferindo dinheiro da conta da maria para a conta do jose
        contaDaMaria.transferir(35.0, contaDoJose);

        // fazendo pagamento através da conta da maria
        contaDaMaria.pagar(44.88);

        System.out.println(contaDaMaria.get_saldo());
        System.out.println(contaDoJose.get_saldo());


    }

}

