package Lista01VariaveisOpMatInputOutput;

import java.util.Scanner;
import java.util.Date;

public class Exercicio1CalculaIdade {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Olá seja bem vindo a aplicação");
        System.out.println("Este sistema irá calcular a sua idade.");
        System.out.println("---------------------------------------");
        System.out.println("Insira aqui o ano do seu nascimento.");
        int birthYear = Input.nextInt();


        Date dt=new Date();
        int year=dt.getYear();
        int currentYear=year+1900;


        int resultAge = currentYear - birthYear;
        System.out.println("---------------------------------------");
        System.out.println("O ano de nascimento informado é " + birthYear);
        System.out.printf("Você tem %d anos em %d.", resultAge, currentYear);

    }
}
