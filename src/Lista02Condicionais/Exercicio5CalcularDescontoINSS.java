package Lista02Condicionais;

import java.util.Scanner;

public class Exercicio5CalcularDescontoINSS {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("Olá seja bem vindo à aplicação!");
        System.out.println("Descrição:\nEste sistema irá calcular o desconto do INSS a ser recolhido do seu salário.");
        System.out.println();

        System.out.println("-------------- Insira o valor do seu salário ---------------");
        double valorSalario = Input.nextDouble();
        double percSalario1 = valorSalario * 0.075 ; // até 1212,00
        double percSalario2 = (valorSalario - 1212) * 0.09 + 90.90; // até 2427,35
        double percSalario3 = (valorSalario - 2427.35) * 0.12 + 90.90 + 109.38; //até 3641,03
        double percSalario4 = (valorSalario - 3641.03) * 0.14 + 90.90 + 109.38 + 145.64; // até 7087,22
        double percSalario5 = 828.38; //valor fixo acima de 7087,22


        if(valorSalario <= 1212){
            System.out.printf("O valor do salário informado foi de R$ %.2f.\n" +
                    "O desconto do INSS será de: R$ %.2f ",valorSalario, percSalario1);
            System.out.println("\n------------------------------------------------------------");
        } else if(valorSalario > 1212 && valorSalario <= 2427.35){
            System.out.printf("O valor do salário informado foi de R$ %.2f.\n" +
                    "O desconto do INSS será de: R$ %.2f ",valorSalario, percSalario2);
            System.out.println("\n------------------------------------------------------------");
        } else if (valorSalario > 2427.35 && valorSalario <= 3641.03) {
            System.out.printf("O valor do salário informado foi de R$ %.2f.\n" +
                    "O desconto do INSS será de: R$ %.2f ",valorSalario, percSalario3);
            System.out.println("\n------------------------------------------------------------");
        }else if(valorSalario > 3641.03 && valorSalario <= 7087.22){
            System.out.printf("O valor do salário informado foi de R$ %.2f.\n" +
                    "O desconto do INSS será de: R$ %.2f ",valorSalario, percSalario4);
            System.out.println("\n------------------------------------------------------------");
        } else{
            System.out.printf("O valor do salário informado foi de R$ %.2f.\n" +
                    "O desconto do INSS será de: R$ %.2f ",valorSalario, percSalario5);
            System.out.println("\n------------------------------------------------------------");
        }


    }
}
