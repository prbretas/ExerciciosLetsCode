package Lista02Condicionais;

import java.util.Scanner;
// import necessario para utilizar a classe Scanner

public class Exercicio1CalcularMedia {
    public static void main(String[] args) {

//Instancia buffer utilizando a classe Scanner
        Scanner Input = new Scanner(System.in);
        boolean continuar;


        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("Olá seja bem vindo à aplicação");
        System.out.println("Este sistema irá calcular a média de notas do aluno");


        do {
            continuar = false;
            try {
                System.out.println();
                System.out.println("--------------- Digite a 1º nota ---------------");
                double nota1 = Input.nextDouble(); //Recebe a primeira nota

                System.out.println();
                System.out.println("--------------- Digite a 2º nota ---------------");
                double nota2 = Input.nextDouble(); //Recebe a segunda nota

                System.out.println();
                System.out.println("--------------- Digite a 3º nota ---------------");
                double nota3 = Input.nextDouble(); //Recebe a terceira nota

                System.out.println();
                System.out.println("--------------- Digite a 4º nota ---------------");
                double nota4 = Input.nextDouble(); //Recebe a quarta nota

                double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

                System.out.printf("As notas digitadas foram: %.2f, %.2f, %.2f, %.2f.", nota1, nota2, nota3, nota4);
                System.out.println();
                System.out.printf("A média das notas do aluno é: %.2f \n", mediaNotas);

                if (mediaNotas >= 6) {
                    System.out.println("Parabéns você foi aprovado");
                } else {
                    System.out.println("Que pena! Você foi reprovado, estude mais!");
                }


            } catch (Exception e) {
                System.out.println("Digite um número válido,\n ERRO: " + e);


            }finally {
                System.out.println("The 'try catch' is finished.");
            }


        } while (!continuar);



    }

    }


