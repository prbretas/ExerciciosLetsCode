package Tabuada;

import java.util.Scanner;

public class Tabuada { //NOME DA CLASSE
    Scanner input = new Scanner(System.in);

    // ATRIBUTOS
    int numero;

    int op;
    int resultado;

    //METODOS
    public void calcularTabuada() {

        for (op = 1; op <= 10; op++) {
            resultado = numero * op;
            System.out.println(numero + " x " + op + " = " + resultado);
        }
    }

    public void entradaDados() {
        System.out.println("Digite um número para saber a sua tabuada:");
        numero = input.nextInt();
        //input.close();
    }

}
