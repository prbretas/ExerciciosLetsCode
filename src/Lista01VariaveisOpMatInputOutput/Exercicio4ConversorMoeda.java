package Lista01VariaveisOpMatInputOutput;

import java.util.Scanner;

public class Exercicio4ConversorMoeda {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Olá seja bem vindo a aplicação");
        System.out.println("Este sistema irá converter a moeda Real em outras moedas.");
        System.out.println("A data de referência é 18/11/2022");
        System.out.println("---------------------------------------");
        System.out.println("Insira aqui o valor em Real(R$) que deseja converter.");
        double valorInformado = Input.nextDouble();

        double real = 1;
        double dollar = 0.1858;
        double euro =  0.1796;
        double libraEsterlina =  0.1562;
        double pesoArgentino = 30.2504;
        double coroaTcheca = 4.3812;

        double convertDollar = valorInformado * real * dollar;
        double convertEuro = valorInformado * real * euro;
        double convertLibra = valorInformado * real * libraEsterlina;
        double convertPeso = valorInformado* real * pesoArgentino;
        double convertCoroa = valorInformado* real * coroaTcheca;
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("O valor recebido é de R$" + valorInformado +  " reais. \nNo dia de hoje, equivale a: ");
        System.out.println("- US$ " +convertDollar+ " Dollars");
        System.out.println("- € " +convertEuro+ " € Euros");
        System.out.println("- £ " +convertLibra+ " £ Libras Esterlinas");
        System.out.println("- $ " +convertPeso+ " Pesos Argentinos");
        System.out.println("- Kč$ " +convertCoroa+ " Kč Coroas Tchecas");
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("Desafio Extra: Limite para 2 a quantidade de casas decimais.");
        System.out.printf("- US$  %.2f Dollars %n",convertDollar);
        System.out.printf("- € %.2f Euros %n",convertEuro);
        System.out.printf("- £ %.2f Libras %n",convertLibra);
        System.out.printf("- $ %.2f Pesos Argentinos %n",convertPeso);
        System.out.printf("- Kč$  %.2f Coroas Tchecas %n",convertCoroa);


    }
}
