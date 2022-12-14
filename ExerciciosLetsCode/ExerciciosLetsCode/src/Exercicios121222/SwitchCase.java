package Exercicios121222;
//Elaborar um programa que verifique o numero de dias de determinado mes
//a ser informado pelo usuario
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("----------------------------------------------------------");
        System.out.println("Olá Seja Bem Vindo");
        System.out.println("Este sistema irá mostrar a quantidade de dias em cada mês.");
        System.out.println("Selecione um mês e descubra!");
        System.out.println("\n1 - Janeiro" +
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
                "\n12 - Dezembro" +
                "\n123 - SAIR");

        int numDays;
        String mesNome;
        boolean continuar;

        do{
          Input = new Scanner(System.in);
            continuar = false;
            try {
                int mes = Input.nextInt();
                if (mes == 1) {
                    numDays = 31;
                    mesNome = "Janeiro";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 2) {
                    numDays = 28;
                    mesNome = "Fevereiro";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 3) {
                    numDays = 31;
                    mesNome = "Março";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 4) {
                    numDays = 30;
                    mesNome = "Abril";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 5) {
                    numDays = 31;
                    mesNome = "Maio";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 6) {
                    numDays = 30;
                    mesNome = "Junho";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 7) {
                    numDays = 31;
                    mesNome = "Julho";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 8) {
                    numDays = 31;
                    mesNome = "Agosto";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 9) {
                    numDays = 30;
                    mesNome = "Setembro";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 10) {
                    numDays = 31;
                    mesNome = "Outubro";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 11) {
                    numDays = 30;
                    mesNome = "Novembro";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 12) {
                    numDays = 31;
                    mesNome = "Dezembro";
                    System.out.println("O mês de " + mesNome + " tem " + numDays + " dias");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Selecione novamente um mês:");
                } else if (mes == 123) {
                    continuar = true;
                    System.out.println("Obrigado por utilizar este sistema!");
                    System.out.println("Volte Sempre!");
                    System.out.println("-------------------------------------------------");
                } else {
                    System.out.println("ERRO: Digite um mês válido em formato numérico");
                    System.out.println("-------------------------------------------------");
                }
            } catch (Exception e) {
                System.out.println("ERRO: Digite um mês válido em formato numérico");
                System.out.println("----------------------------------------------");
            }
        } while(!continuar);
    }
}

