package Lista03Lacos;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3SumRandomNumbers {
    public static void main(String[] args) {
    //Instancia utilizando a classe Random
    Random random = new Random();
    //Instancia utilizando a classe Scanner
    Scanner entrada = new Scanner (System.in);


        System.out.println("Olá, seja bem vindo a aplicação!");
        System.out.println("Este sistema irá lançar dados e somá-los.");
        System.out.println("------------------------------------------------------");
        System.out.println("Digite abaixo a quantidade de números que deseja gerar:");

    //int numeroDeSorteios = Integer.parseInt(args[0]); //deve se colocar o parse pra converter o ARGS que é STRING
    //int numeroSorteado = random.nextInt(1,7); //origem e bouind -> é o final mas nao aparece

        int numeroDeSorteios = entrada.nextInt();
        int soma=0;
        int numerosSorteados[]=new int[numeroDeSorteios];

for(int i= 0; i < numeroDeSorteios; i++){
            int numeroSorteado = random.nextInt(1,7); //origem e bouind -> é o final mas nao aparece
    numerosSorteados[i] = numeroSorteado;
    soma += numeroSorteado;
    System.out.printf("- O número da posição %d sorteado foi %d. \n", i, numeroSorteado);
        }
        System.out.println();
        System.out.printf("A soma dos números sorteados é de %d.", soma);
        System.out.println("\n------------------------------------------------------");

    }
}
