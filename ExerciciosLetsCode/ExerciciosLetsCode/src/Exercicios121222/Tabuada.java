package Exercicios121222;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Olá seja bem vindo!");
        System.out.println("Este sistema irá calcular a Tabuada");

        System.out.println("Digite abaixo um número");
        int numero = Input.nextInt();
        System.out.println("Tabuada do número: " + numero);

        for(int i = 0; i < 11; i++){
            System.out.print(numero + " x " + i + " = ");
            System.out.println(i * numero);


        }


    }
}
