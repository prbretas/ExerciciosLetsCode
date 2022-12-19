package ContaBancaria;
/*EXERCÍCIO 02: Faça um programa para ler:
- número da conta do cliente,
- saldo,
 - débito e
 - crédito.

 Após, calcular e escrever o saldo atual:
  (saldo atual = saldo - débito + crédito).

  Também testar se saldo atual for maior
   ou igual a zero escrever a mensagem 'Saldo Positivo',
   senão escrever a mensagem 'Saldo Negativo'.


   DICAS PARA RESOLVER O EXERCÍCIO:

1) Identifique quem são os atributos.
Defina sua tipagem (tipo de dado)
e apliquem o encapsulamento na definição do mesmo (private).

2) Verifiquem quais possíveis métodos. Nesse exemplo, podem ser
até dois métodos. Quando se referirem a atributos, usem o THIS antes do nome dele

3) Façam a entrada de dados na classe principal, para testar o GET/SET


  */

public class MainContaBancaria {

    public static void main(String[] args) {



        ContaBancaria conta1 = new ContaBancaria();
        System.out.println(conta1.calcularCredito());
        conta1.set_credito(30);

        System.out.println(conta1.calcularCredito());
        conta1.set_credito(50);
        System.out.println(conta1.calcularCredito());

        conta1.set_debito(18.5);
        System.out.println(conta1.calcularDebito());




    }


}
