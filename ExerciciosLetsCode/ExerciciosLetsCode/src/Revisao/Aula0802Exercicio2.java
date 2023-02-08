package Revisao;/*

-----------------------------------------------------------------------------------
Exercício 2
Crie um programa que receba duas palavras e determine se elas são um anagrama.

Exemplos de execução:

batata
tabata

true
xicara
cachimbo

false
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Aula0802Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite palavra 1: ");
        String palavra1 = scanner.nextLine();
        System.out.println("Digite palavra 2: ");
        String palavra2 = scanner.nextLine();

        ArrayList<Character> lista1 = new ArrayList<>();
        ArrayList<Character> lista2 =  new ArrayList<>();

        for(char letra : palavra1.toCharArray()){
            lista1.add(letra);
        }

        for(char letra : palavra2.toCharArray()){
            lista1.add(letra);
        }


    }
}

