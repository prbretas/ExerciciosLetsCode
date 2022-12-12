package Exercicios121222;

/*
   Exercício 3:  Escreva um programa que leia o nome e a idade de cinco pessoas
  e ao final informe quem é o mais novo, o mais velho e qual a média de idades; use arrays
*/

public class MediaIdade {
    public static void main(String[] args) {

        String[] nomes = {"João", "Maria", "Jose", "Carlos", "Sofia"};
        int[] idades = {14, 16, 15, 18, 17};

        System.out.println("- Lista de pessoas:");
        System.out.println(nomes[0] + " tem " + idades[0] + " anos");
        System.out.println(nomes[1] + " tem " + idades[1] + " anos");
        System.out.println(nomes[2] + " tem " + idades[2] + " anos");
        System.out.println(nomes[3] + " tem " + idades[3] + " anos");
        System.out.println(nomes[4] + " tem " + idades[4] + " anos");
        System.out.println();


        int mediaIdades = idades[(0 + 1 + 2 + 3 + 4) / 5];
        System.out.println("A média de idades das pessoas é de: " + mediaIdades + " anos.");
        System.out.println();


        int maiorIdade = 0;
        int menorIdade = 0;
        int mediaIdade = 0;
        int somatorio = 0;



        for(int i = 0; i< idades.length; i++){
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
            }
            if(idades[i] < menorIdade){
                menorIdade = idades[i];
            }
            somatorio += idades[i];
            mediaIdade = idades[i]/ idades.length;
        }

        System.out.println(mediaIdade);




    }
}
