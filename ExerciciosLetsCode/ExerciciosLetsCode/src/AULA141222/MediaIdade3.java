package AULA141222;

import java.util.Scanner;

public class MediaIdade3 {
    Scanner input = new Scanner(System.in);

    String[] nome = new String[5];
    int[] idades = new int[5];
    int menor = 1000, maior;
    String nomeMenor = "", nomeMaior = "";
    double soma, media;

    public void entradaDados() {
        boolean sair;
        for (int i = 0; i < nome.length; i++) {
//             nome[i] = "";
//             idades[i] = 1;


            do {
                sair = false;
                try {
                    System.out.println("Digite o nome do " + (i + 1) + "° aluno: ");
                    nome[i] = input.next();
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
                    idades[i] = input.nextInt();
                    sair = true;

                } catch (Exception e) {
                    System.out.println("DIGITE APENAS NÚMEROS");
                }
            } while (!sair);


            soma += idades[i]; // soma = soma + idades[i];
            media = soma / (i + 1);

            if (idades[i] < menor) {
                menor = idades[i];
                nomeMenor = nome[i];
            } else if (idades[i] > maior) {
                maior = idades[i];
                nomeMaior = nome[i];
            }
        }
    }


    public void resultado() {
        System.out.println("A média da idades é: " + media);
        System.out.println("O aluno " + nomeMaior + " é o MAIS VELHO, tem " + maior + " anos.");
        System.out.println("O aluno " + nomeMenor + " é o mais novo,  tem " + menor + " anos.");
    }


}

