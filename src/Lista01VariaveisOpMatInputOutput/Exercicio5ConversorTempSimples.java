package Lista01VariaveisOpMatInputOutput;

import java.util.Scanner;

public class Exercicio5ConversorTempSimples {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Olá seja bem vindo a aplicação");
        System.out.println("Este sistema irá converter a temperatura Celsius para Farenheit.");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Insira abaixo o valor da temperatura em Celsius.");
        double tempCelsius = Input.nextDouble();
        
        double convertTemp = ( tempCelsius * 9/5) + 32;

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("A temperatura informada é de %.2f ºC.\n",tempCelsius);
        System.out.printf("A temperatura convertida é de %.2f ºF\n", convertTemp);
        System.out.println("-----------------------------------------------------------------");

    }
}
