package AULA141222;

import java.util.Scanner;

public class IdadeNome {
    Scanner input = new Scanner(System.in);
    String[] aluno = new String[5];
    int[] idade = new int[5];
    int menor = 1000, maior;
    String nomem = "", nomev = "";
    float soma, media;

    public void entradaDado() {
        boolean sair;


        for (int i = 0; i < aluno.length; i++) {

            do {
                sair = false;
                try {
                    System.out.println("Digite o nome do " + (i + 1) + "° aluno: ");
                    aluno[i] = input.next();
                    sair = true;
                } catch (Exception e) {
                    System.out.println("DIGITE APENAS LETRAS");
                }
            } while (!sair);


            do {
                sair = false;
                input = new Scanner(System.in);
                try {
                    System.out.println("Digite a idade do " + (i + 1) + "° aluno: ");
                    idade[i] = input.nextInt();
                    sair = true;

                } catch (Exception e) {
                    System.out.println("DIGITE APENAS NÚMEROS");
                }
            } while (!sair);



            soma += idade[i];
            media = soma / (i + 1);

            if (idade[i] < menor) {
                menor = idade[i];
                nomem = aluno[i];
            } else if (idade[i] > maior) {
                maior = idade[i];
                nomev = aluno[i];
            }
        }
    }

    public void resultado() {

        System.out.println("A média da idades é: " + media);
        System.out.println("O aluno " + nomev + " que é o mais velho tem " + maior + " anos.");
        System.out.println("O aluno " + nomem + " que é o mais novo tem " + menor + " anos.");
    }
}