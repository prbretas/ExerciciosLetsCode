package Exercicios121222;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Olá seja bem vindo!");
        System.out.println("Este sistema irá calcular a Tabuada");

        int numero = 0;
        boolean continuar;


        do {
            continuar = false;
            try {
                Input = new Scanner(System.in);
                System.out.println();
                System.out.println("Digite um número abaixo :");
                numero = Input.nextInt();
                System.out.println("Tabuada do número: " + numero);
                continuar = true;



            } catch (Exception e) {
                System.out.println("ERRO: Digite um valor válido");

            }

        } while (!continuar);


        for (int i = 0; i < 11; i++) {
            System.out.print(numero + " x " + i + " = ");
            System.out.println(i * numero);

        }

    }
}
