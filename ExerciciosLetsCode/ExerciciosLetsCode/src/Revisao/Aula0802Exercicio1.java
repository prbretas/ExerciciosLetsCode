package Revisao;/*

Exercício 1
Criar um programa que recebe uma lista de palavras do usuário.
Deve-se pedir uma nova palavra até que o usuário insira uma string vazia.

Ao final, deve-se imprimir apenas a palavra que ficaria
na última posição se a lista estivesse ordenada alfabeticamente.

Exemplo de execução:
Digite uma palavra: Zezinho
Digite uma palavra: Maria
Digite uma palavra: André
Digite uma palavra:

Zezinho

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

* */

import java.util.ArrayList;
import java.util.Scanner;

public class Aula0802Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra:");
        ArrayList<String> palavras = lerListaPalavras();


    //    String palavra1 = "jose";
  //      String palavra2 = "ze";

//        System.out.println(palavra1.compareTo(palavra2));


      String ultimaPalavra= palavras.get(0);

      for(String palavra : palavras){
          if(ultimaPalavra.toLowerCase().compareTo(palavra.toLowerCase()) < 0){
              ultimaPalavra = palavra;
          }
      }
        System.out.println();
        System.out.println("Essa foi a última palavra digita em ordem afabética : " + ultimaPalavra);
    }



    private static ArrayList<String> lerListaPalavras(){
        Scanner scanner = new Scanner(System.in);
        //LISTA ARRAY
        ArrayList<String> palavras = new ArrayList<>();
        //String[] palavras = new String[];
        String input = scanner.nextLine();
        // !input.isEmpty() ---> !input.equals("")
        //int i =0;

        while(!input.isEmpty()){
            palavras.add(input);
            System.out.println("Digite uma palavra:");
            input = scanner.nextLine();
        }

        for(String palavra :palavras){
            System.out.println(palavra);
        }
        return palavras;
    }

}

