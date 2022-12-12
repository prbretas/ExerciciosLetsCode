package Lista03Lacos;

import java.util.Scanner;

public class Exercicio2Escada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Selecione a quantidade do padrão");
        int inputAmount = entrada.nextInt();

        for(int i = 1; i <= inputAmount; i++) {

            for (int ia = 1;ia <= i ;ia++){
                System.out.print("#");
            }

            System.out.println();




        }
    }}
