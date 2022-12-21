import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("     -------JOGO DA VELHA-------");
        System.out.println("Digite o número para selecionar um espaço");

        mostrarTabuleiro(); // Mostrar tab para os jogadores


        System.out.println();
        System.out.println("    É a vez do Jogador 1 - X");
        int jogador1 = Input.nextInt();
        //System.out.println(Jogador1); // mostrar resultado selecionado na tela

        mostrarTabuleiro();
        System.out.println();
        System.out.println("     É a vez do Jogador 2 - O");
        int jogador2 = Input.nextInt();
        //System.out.println(Jogador2);// mostrar resultado selecionado na tela

   }

   public static void mostrarTabuleiro(){
       String tabuleiro[][] = new String[3][3];
       tabuleiro[0][0] = "7";
       tabuleiro[0][1] = "8";
       tabuleiro[0][2] = "9";

       tabuleiro[1][0] = "4";
       tabuleiro[1][1] = "5";
       tabuleiro[1][2] = "6";

       tabuleiro[2][0] = "1";
       tabuleiro[2][1] = "2";
       tabuleiro[2][2] = "3";

       System.out.printf("\n" +
               "           " + tabuleiro[0][0] + "\t " +  tabuleiro[0][1] + "\t   " +  tabuleiro[0][2] + "\n" + "\n"+
               "           " + tabuleiro[1][0] + "\t " +  tabuleiro[1][1] + "\t   " +  tabuleiro[1][2] + "\n" + "\n"+
               "           " + tabuleiro[2][0] + "\t " +  tabuleiro[2][1] + "\t   " +  tabuleiro[2][2]  + "\n");
   }


   public static void alterarTabuleiro(){


   }




}
