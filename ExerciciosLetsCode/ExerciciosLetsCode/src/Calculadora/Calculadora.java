package Calculadora;
import java.util.Scanner;

public class Calculadora {
    Scanner input = new Scanner(System.in);
    double numero1;
    int op;
    double numero2;
    double resultado;


    public void entradaDados() {
        boolean continuar;
        boolean continuar2;

        do {
            continuar2 = false;

        do {
            continuar = false;
            try {
                input = new Scanner(System.in);
                System.out.println("Digite um NUMERO:");
                numero1 = input.nextDouble();
                continuar = true;
            } catch (Exception e) {
                System.out.println("ERRO: Digite um NÚMERO!");
            }
        } while (!continuar);

        do {
            continuar = false;
            try {
                input = new Scanner(System.in);
                System.out.println("Digite a Operação: ");
                System.out.println("1 - SOMAR (+)");
                System.out.println("2 - SUBTRAIR (-)");
                System.out.println("3 - MULTIPLICAR (*)");
                System.out.println("4 - DIVIDIR (/)");
                op = input.nextInt();

                continuar = true;
                } catch (Exception e) {
                System.out.println("ERRO: Digite uma OPERAÇÃO válida!");
            }
        } while (!continuar);

        do {
            continuar = false;
            try {
                input = new Scanner(System.in);
                System.out.println("Digite outro NUMERO:");
                numero2 = input.nextDouble();
                continuar = true;
            } catch (Exception e) {
                System.out.println("ERRO: Digite um NÚMERO!");
            }
        } while (!continuar);



        if (op == 1) {
            somarNumeros();
            System.out.println("--------------------------------------------");
            System.out.println("O resultado  da soma é: " + resultado);
            System.out.println("--------------------------------------------");
        } else if (op == 2) {
            subtrairNumeros();
            System.out.println("--------------------------------------------");
            System.out.println("O resultado da subtração é: " + resultado);
            System.out.println("--------------------------------------------");
        } else if (op == 3) {
            multiplicarNumeros();
            System.out.println("--------------------------------------------");
            System.out.println("O resultado da multiplicação é: " + resultado);
            System.out.println("--------------------------------------------");
        } else if (op == 4) {
            dividirNumeros();
            System.out.println("--------------------------------------------");
            System.out.println("O resultado da divisão é: " + resultado);
            System.out.println("--------------------------------------------");
        }
        }while (!continuar2);
    }

    public double somarNumeros() {
        resultado = numero1 + numero2;
        return resultado;
    }

    public double subtrairNumeros() {
        resultado = numero1 - numero2;
        return resultado;
    }

    public double multiplicarNumeros() {
        resultado = numero1 * numero2;
        return resultado;
    }

    public double dividirNumeros() {
        resultado = numero1 / numero2;
        return resultado;
    }


}
