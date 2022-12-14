package Exercicios121222;

/* Exercício 4: Escreva um programa que entre com o nome, peso e altura
 * de cinco pessoas calcule o IMC de cada um e ao final informe se alguém está
 * fora do peso ideal (IMC ideal é entre 18.5 e 25)*/
/*
Math.pow (altura, 2) // calculo
double calcularIMC = Math.pow(alturas, 2);
* */

/* Classificação - IMC
abaixo de 18,5 - abaixo do peso
entre 18,6 e 24,9 - Peso ideal (parabéns)
entre 25,0 e 29,9 - Levemente acima do peso
entre 30,0 e 34,9 - Obesidade grau I
entre 35,0 e 39,9 - Obesidade grau II (severa)
acima de 40 - Obesidade III (mórbida)*/

import java.util.Scanner;

public class CalcularIMC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------- Olá Seja Bem Vindo! --------------");
        System.out.println("------- Este sistema irá calcular seu IMC -------");
        System.out.println();

        boolean sair;
        boolean sair2;
        String inputNome = "";
        double inputPeso = 0;
        double inputAltura = 0;

        do {
            sair2 = false;
            do {
                sair = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite o seu Nome:");
                    inputNome = input.nextLine();
                    sair = true;

                    for (int i = 0; i < inputNome.length(); i++) {
                        char letra = inputNome.charAt(i);
                        if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9') {
                            System.out.println("Números são inválidos!");
                            sair = false;
                            i = inputNome.length();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um nome.");
                }
            } while (!sair);

            do {
                sair = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite o seu Peso em kg: \n" +
                            "(Ex: 69,7)");
                    inputPeso = input.nextDouble();
                    sair = !(inputPeso <= 0);

                } catch (Exception f) {
                    System.out.println("ERRO: Digite um valor válido");
                }
            } while (!sair);

            do {
                sair = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite a sua Altura em metros: \n" +
                            "(Ex: 1,78)");
                    inputAltura = input.nextDouble();
                    sair = !(inputAltura <= 0);
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um valor válido");
                }
            } while (!sair);

            double IMC = calcularIMC(inputPeso, inputAltura);
            TesteIMC(inputNome, IMC);

        } while (!sair2);

    }
    // ---------------------------- FUNÇÕES ----------------------------
    public static double calcularIMC(double inputPeso, double inputAltura) {
        return inputPeso / (inputAltura * inputAltura);
    }
    public static void TesteIMC(String inputNome, double calcularIMC) {
        if (calcularIMC < 18.5) {
            System.out.println("O IMC do " + inputNome + " é : " + calcularIMC);
            System.out.println(inputNome + " está abaixo do peso.\n");
        } else if (calcularIMC >= 18.6 && calcularIMC <= 24.9) {
            System.out.println("O IMC do " + inputNome + " é : " + calcularIMC);
            System.out.println(inputNome + " está no peso ideal.\n");
        } else if (calcularIMC >= 25 && calcularIMC <= 29.9) {
            System.out.println("O IMC do " + inputNome + " é : " + calcularIMC);
            System.out.println(inputNome + " está levemente acima do peso.\n");
        } else if (calcularIMC >= 30 && calcularIMC <= 34.9) {
            System.out.println("O IMC do " + inputNome + " é : " + calcularIMC);
            System.out.println(inputNome + " está em Obesidade I.\n");
        } else if (calcularIMC >= 35 && calcularIMC <= 39.9) {
            System.out.println("O IMC do " + inputNome + " é : " + calcularIMC);
            System.out.println(inputNome + " está em Obesidade II.\n");
        } else if (calcularIMC > 40) {
            System.out.println("O IMC do " + inputNome + " é : " + calcularIMC);
            System.out.println(inputNome + " está em Obesidade III - Mórbida.");
        }
    }
    
}
