package Exercicios121222;

import java.util.Scanner;

public class SwitchCasePROFAnderson {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Este programa irá calcular a quantidade de dias do mês \n" +
                "e retornar se o ano é bissexto");
        System.out.println("Selecione o mês e ano e descubra\n" +
                "a quantidade de dias e se é o ano Bissexto");


        System.out.println("1 - Janeiro" +
                "\n2 - Fevereiro" +
                "\n3 - Março" +
                "\n4 - Abril" +
                "\n5 - maio" +
                "\n6 - Junho" +
                "\n7 - Julho" +
                "\n8 - Agosto" +
                "\n9 - Setembro" +
                "\n10 - Outubro" +
                "\n11 - Novembro" +
                "\n12 - Dezembro");
        System.out.println("Digite o mês:");
        int mes = Input.nextInt();
        int dias = 0;
        String mesNome;

        System.out.println("Digite o ano:");
        int ano = Input.nextInt();


        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                mesNome = "Fevereiro";
                if ((ano % 4 == 0) && !(ano % 100 == 0) || (ano % 400 == 0)) {
                    dias = 29;
                    System.out.printf("O ano de %s é bisexto\n", ano);
                } else {
                    dias = 28;
                }
                System.out.printf("O mês de %s tem %d dias", mesNome, dias);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                System.out.printf("O mês selecionado tem %d dias", dias);
                break;
            default:
                System.out.println("Selecione um mês válido");
                break;
        }



    }

}
