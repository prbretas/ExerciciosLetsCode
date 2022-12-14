package Exercicios121222;

import java.util.Scanner;

public class SwitchCasePROFAnderson {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("----------------------------------------------------------");
        System.out.println("Olá Seja Bem Vindo");
        System.out.println("Este programa irá calcular a quantidade de dias do mês \n" +
                "e retornar se o ano é bissexto");
        System.out.println("Selecione o MÊS e ANOo e descubra\n" +
                "a quantidade de dias e se é o ano Bissexto");

        System.out.println("\n1 - Janeiro" +
                "\n2 - Fevereiro" +
                "\n3 - Março" +
                "\n4 - Abril" +
                "\n5 - Maio" +
                "\n6 - Junho" +
                "\n7 - Julho" +
                "\n8 - Agosto" +
                "\n9 - Setembro" +
                "\n10 - Outubro" +
                "\n11 - Novembro" +
                "\n12 - Dezembro" +
                "\n123 - SAIR DO PROGRAMA");

        int dias = 0;
        String mesNome;
        boolean continuar;

        int mes;
        int ano;

        do {
            continuar = false;
            try {
                System.out.println("\nDigite o mês:");
                mes = Input.nextInt();

                System.out.println("Digite o ano:");
                ano = Input.nextInt();

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
                            System.out.printf("O ano de %s é BISSEXTO.\n", ano);
                            System.out.printf("Por isso, no ano de %s , o mês de %s tem %d dias.", ano, mesNome, dias);
                        } else {
                            dias = 28;
                            System.out.printf("No ano de %s , o mês de %s tem %d dias.", ano, mesNome, dias);
                        }
                        break;

                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        dias = 30;
                        break;
                    default:
                        System.out.println("Selecione um mês válido");
                        break;

                }
                if (mes == 1) {
                    mesNome = "Janeiro";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);
                } else if (mes == 2) {
                } else if (mes == 3) {
                    mesNome = "Março";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);
                } else if (mes == 4) {
                    mesNome = "Abril";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 5) {
                    mesNome = "Maio";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 6) {
                    mesNome = "Junho";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 7) {
                    mesNome = "Julho";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 8) {
                    mesNome = "Agosto";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 9) {
                    mesNome = "Setembro";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 10) {
                    mesNome = "Outubro";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 11) {
                    mesNome = "Novembro";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 12) {
                    mesNome = "Dezembro";
                    System.out.printf("No ano de %s, o mês de %s tem %d dias.", ano, mesNome, dias);

                } else if (mes == 123) {
                    continuar = true;
                    System.out.println("Obrigado por utilizar este sistema!");
                    System.out.println("Volte Sempre!");
                    System.out.println("-------------------------------------------------");
                }else {
                    System.out.println("ERRO: Digite um mês válido");

                }


            } catch (Exception a) {
                System.out.println("ERRO: Digite um mês válido em formato numérico");
                System.out.println("----------------------------------------------");
            }

        } while (!continuar);

    }

}
