package Exercicios121222;

/*
 *
 * Exercício 4: Escreva um programa que entre com o nome, peso e altura
 * de cinco pessoas calcule o IMC de cada um e ao final informe se alguém está
 * fora do peso ideal (IMC ideal é entre 18.5 e 25)*/
/*
Math.pow (altura, 2) // calculo
* */

/* Classificação - IMC

abaixo de 18,5 - abaixo do peso
entre 18,6 e 24,9 - Peso ideal (parabéns)
entre 25,0 e 29,9 - Levemente acima do peso
entre 30,0 e 34,9 - Obesidade grau I
entre 35,0 e 39,9 - Obesidade grau II (severa)
acima de 40 - Obesidade III (mórbida)*/

public class CalcularIMC {
    public static void main(String[] args) {

        String[] nomes = {"João", "Maria", "Jose", "Carlos", "Sofia"};
        int[] idades = {14, 16, 15, 18, 17};
        int[] pesos = {50, 45, 68, 78, 106};
        double[] alturas = {1.44, 1.56, 1.75, 1.82, 1.67};


        for (int i = 0; i < 5; i++) {
//            double calcularIMC = Math.pow(alturas, 2);
            double calcularIMC = pesos[i] / (alturas[i] * alturas[i]);

            System.out.println("O IMC do " + nomes[i] + " é : " + calcularIMC);

            if (calcularIMC < 18.5) {
                System.out.println(nomes[i]+ " está abaixo do peso\n");
            } else if (calcularIMC >= 18.6 && calcularIMC <= 24.9) {
                System.out.println(nomes[i]+ " está no peso ideal\n");
            } else if (calcularIMC >= 25 && calcularIMC <= 29.9) {
                System.out.println(nomes[i]+ " está levemente acima do peso\n");
            } else if (calcularIMC >= 30 && calcularIMC <= 34.9) {
                System.out.println(nomes[i]+ " está em Obesidade I\n");
            } else if (calcularIMC >= 35 && calcularIMC <= 39.9) {
                System.out.println(nomes[i]+ " está em Obesidade II\n");
            } else if (calcularIMC > 40) {
                System.out.println(nomes[i]+ " está em Obesidade III - Mórbida");

            }
        }
    }}
