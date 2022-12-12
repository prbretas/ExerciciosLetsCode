package Lista03Lacos;

import java.util.Scanner;


public class Exercicio1NumerosImpares {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);

       System.out.println("Bem vindo ao sistema,\nDigite um número e ele irá mostrar apenas os números ímpares");

       int numberInput = entrada.nextInt();
       for(int i = 1; i <= numberInput; i = i + 2 ){
           System.out.printf(i+", ");
       }

        //System.out.println(numberInput % 2 == 1);

    }
}
