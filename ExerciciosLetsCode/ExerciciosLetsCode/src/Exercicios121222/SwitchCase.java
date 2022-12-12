package Exercicios121222;

//Elaborar um programa que verifique o numero de dias de determinado mes
//a ser informado pelo usuario

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Selecione um mês e descubra a quantidade de dias");

        String[] Month = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};


        int mes = Input.nextInt();
        int numDays ;

        switch (mes) {
            case 1:
                numDays = 31;
                System.out.println("January");
                System.out.printf("O mês de janeiro tem %d", numDays);

                break;
            case 2:
                numDays = 28;
                System.out.println("February");
                System.out.printf("O mês de fevereiro tem %d", numDays);
                break;
            case 3:
                numDays = 31;
                System.out.println("March");
                System.out.printf("O mês de março tem %d", numDays);
                break;
            case 4:
                numDays = 30;
                System.out.println("April");
                System.out.printf("O mês de Abril tem %d", numDays);
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Insira um mês válido.");
                break;
        }

        System.out.println();


    }
}



/*

switch (mes){
        case 1 :
        quantidadeDeDias = "Janeiro(1) tem 31 dias";
        break;
        case 2 :
        if(ano % 4 == 0){
        quantidadeDeDias = "Fevereiro(2) tem 29 dias";
        }else {
        quantidadeDeDias = "Fevereiro(2) tem 28 dias";
        }
        break;
        case 3 :
        quantidadeDeDias = "Março(3) tem 31 dias";
        break;
        case 4:

*/
