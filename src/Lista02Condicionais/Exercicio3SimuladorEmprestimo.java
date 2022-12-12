package Lista02Condicionais;

import java.util.Scanner;
// import necessario para utilizar a classe Scanner


public class Exercicio3SimuladorEmprestimo {
    public static void main(String[] args) {
        //Instancia buffer utilizando a classe Scanner
        Scanner Input = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Olá seja bem vindo à aplicação!");
        System.out.println("Descrição:\nEste sistema irá realizar um simulação de empréstimo.");
        System.out.println();

        //---------- Insere Idade ----------
        System.out.println("------------------- Insira a sua idade abaixo -------------------");
        double ageInformed = Input.nextDouble();

        //---------- Insere Valor da Renda ----------
        System.out.println("------------------ Insira o valor da sua renda ------------------");
        double salaryInformed = Input.nextDouble();
        double incomeCommitment = salaryInformed /100 * 30;
        System.out.printf("Você pode comprometer até R$ %.2f do seu salário.\n",incomeCommitment);

        //---------- Insere Valor do Empréstimo ----------
        System.out.println("--------------------- Insira o valor desejado --------------------");
        double loanValue = Input.nextDouble();

        //---------- Insere Número de parcelas ----------
        System.out.println("---------- Insira a quantidade de parcelas desejadas -------------");
        System.out.println("          Mínimo 3 parcelas   -   Máximo 24 parcelas              ");
        double numberInstallments = Input.nextDouble();

        //---------- Insere Valor da parcela ----------
        double installmentValue = loanValue / numberInstallments;

        //-----------------------CONDIÇÕES---------------------------
        if(ageInformed >= 18 && ageInformed <= 65) {
        //    System.out.println("Você tem idade para receber um empréstimo");

            if(installmentValue <= incomeCommitment){
           //     System.out.println("A parcela cabe no seu orçamento");
                System.out.printf("A simulação do empréstimo foi realizada com sucesso!\n" +
                        "Você consegue pegar o valor R$ %.2f.\n" +
                        "Parcelar em %.0f vezes.\n" +
                        "E o valor da parcela fica em R$ %.2f.\n",loanValue, numberInstallments, installmentValue);
                System.out.println("-----------------------------------------------------------------");
                if(numberInstallments >= 3 && numberInstallments<=24){
              //      System.out.println("Parcela definida com sucesso");
                }else{
                    System.out.println("A quantidade de parcela é inválida, selecione entre 3 ou 24 parcelas");
                    System.out.println("-----------------------------------------------------------------");
                }
            }else{
                System.out.printf("Infelizmente a parcela de R$ %.2f não cabe no seu orçamento\n", installmentValue);
                System.out.printf("Você só pode comprometer até R$ %.2f da sua renda.",incomeCommitment);
                System.out.println("-----------------------------------------------------------------");
            }
        }else {
            System.out.println("Infelizmente você não tem idade para um empréstimo");
            System.out.println("-----------------------------------------------------------------");
        }


    }
}
