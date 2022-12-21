package AULA21122022;

/*
POLIMORFISMO -

SOBRECARGA - OVERLOAD -> POSSIBILIDADE DE CONSTRUIR, REUTILIZAR,  METODOS COM O MESMO NOME MAS COM
ASSINATURAS DIFERENTES DENTRO DA MESMA CLASSE. É UMA FORMA DE UTILIZAR POLIMORFISMO.

ASSINATURA -
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Geometria calculosGeometricos = new Geometria();
        System.out.println("Digite abaixo o valor do Raio:");

        boolean sair;
        do {
            input = new Scanner(System.in);
            sair = false;
            try {
                System.out.println("Digite abaixo o valor do Raio:");
                double raio = input.nextDouble();
                System.out.println("Area calculada: " + calculosGeometricos.calcular(raio));
                sair = true;
            } catch (Exception e) {
                System.out.println("ERRO: Digite um número!");
            }
        } while (!sair);

        // -------------------------------------------------

        System.out.println("Informe os dois lados do Retangulo:");
        System.out.println("Insira a valor do lado A:");
        double a = input.nextDouble();
        System.out.println("Insira a valor do lado B:");
        double b = input.nextDouble();

        System.out.println("Área do retangulo: " + calculosGeometricos.calcular(a, b));


    }
}
