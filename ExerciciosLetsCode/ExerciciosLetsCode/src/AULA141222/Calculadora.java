package AULA141222;

import java.util.Scanner;

public class Calculadora {
    Scanner input = new Scanner(System.in);
//----------------------- MÉTODOS - ATRIBUTOS-------------------------------------------------
    double numero1;
    String op;
    double numero2;
    double resultado;
//----------------------- MÉTODOS - FUNÇÕES-------------------------------------------------
    public void entradaDados() {
        System.out.println("Digite um NUMERO:");
        numero1 = input.nextDouble();

        System.out.println("Digite a Operação:");
        op = input.next();

        System.out.println("Digite outro NUMERO:");
        numero2 = input.nextDouble();

        switch (op) {
            case "+":
                somarNumeros();
                System.out.println("O resultado é: " + resultado);
                break;
            case "-":
                subtrairNumeros();
                System.out.println("O resultado é: " + resultado);
                break;
            case "*":
                multiplicarNumeros();
                System.out.println("O resultado é: " + resultado);
                break;
            case "/":
                dividirNumeros();
                System.out.println("O resultado é: " + resultado);
                break;
        }
    }
    public double somarNumeros(){
       resultado = numero1 + numero2;
       return  resultado;
    }
    public double subtrairNumeros(){
        resultado = numero1 - numero2;
        return  resultado;
    }
    public double multiplicarNumeros(){
        resultado = numero1 * numero2;
        return  resultado;
    }
    public double dividirNumeros(){
        resultado = numero1 / numero2;
        return  resultado;
    }
}
