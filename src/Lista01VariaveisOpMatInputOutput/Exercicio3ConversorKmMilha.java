package Lista01VariaveisOpMatInputOutput;

import java.util.Scanner;

public class Exercicio3ConversorKmMilha {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Olá seja bem vindo a aplicação");
        System.out.println("Este sistema irá converter Km em Milhas.");
        System.out.println("---------------------------------------");
        System.out.println("Insira abaixo o valor em Km:");
        double kilometers = Input.nextDouble();
        double mile = 0.621371;
        double convertKmMile = kilometers * mile;

        System.out.println("---------------------------------------");
        System.out.printf("O valor recebido em kilometros é de %.3f km \n", kilometers);
        System.out.printf("O resultado em milhas é de %.3f mi", convertKmMile);
    }
}
