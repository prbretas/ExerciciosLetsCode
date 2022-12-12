package Lista01VariaveisOpMatInputOutput;

import java.util.Scanner;

public class Exercicio6CalculaVolumePiscina {
    public static void main(String[] args) {

        //Instância  do objeto (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);

        double poolLength = 20;
        double poolWidth = 10;
        double poolHeight = 1.8;

        double poolVolume = poolHeight * poolLength * poolWidth * 1000;

        System.out.println("As dimensões da piscina são: \n- " + poolHeight+"m de altura\n- " + poolWidth+"m de largura\n- "  + poolLength+"m de comprimento.");
        System.out.println();
        System.out.println("O volume de água que cabe na piscina é de " + poolVolume+ " Litros.");


        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("DESAFIO EXTRA:Permita que o usuário informe 4 valores distintos: largura, comprimento, profundidade inicial e profundidade final. ");


        System.out.println("---------------------------------------");
        System.out.println("Olá seja bem vindo a aplicação");
        System.out.println("Este sistema irá calcular o volume de uma Piscina");
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("------------- CALCULE O VOLUME DE UMA PISCINA -------------");
        System.out.println("Insira o comprimento:");
        double poolInfLength = entrada.nextDouble(); //Recebe o Comprimento

        System.out.println("Insira a Largura:");
        double poolInfWidth = entrada.nextDouble(); //Recebe a Largura

        System.out.println("Insira a Altura Inicial:");
        double poolInfHeightInitial = entrada.nextDouble(); //Recebe a Altura Inicial

        System.out.println("Insira a Altura Final:");
        double poolInfHeightFinal = entrada.nextDouble(); //Recebe a Altura Final


        double poolInfHeight =  (poolInfHeightInitial + poolInfHeightFinal) / 2;
        double volume = poolInfHeight * poolInfLength * poolInfWidth;
        double waterCapacity = volume * 1000;

        System.out.printf("Você inseriu as dimensões:  \n- " +
                "%.2fm de altura\n- " +
                "%.2fm de largura\n- " +
                "%.2fm de comprimento.\n", poolInfHeight, poolInfWidth, poolInfLength);

        System.out.println();
        System.out.printf("A quantidade de água que cabe na piscina é de %.3f de Litros.\n", waterCapacity);


        System.out.println("------------------------------------------");
        System.out.println();




// EXEMPLO PROFESSOR UTILIZANDO ARGS
//        double largura =  Double.parseDouble(args[0]);
//        double comprimento = Double.parseDouble(args[1]);
//        double profundidadeInicial = Double.parseDouble(args[2]);
//        double profundidadeFinal = Double.parseDouble(args[3]);
//
//        System.out.printf("As dimensoes da piscina são %.2f m x %.2f m.\n" +
//                "Sua profundidade inicial é %.2f m e sua profundidade final é %.2f m.", largura, comprimento, profundidadeInicial, profundidadeFinal);
//
//
//



    }
}
