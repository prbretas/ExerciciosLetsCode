package AULA141222;

import java.util.Scanner;

public class Calculadora {
    Scanner input = new Scanner(System.in);

    double numerador;
    String op;
    double denominador;
    double resultado;





    public void entradaDados() {
        System.out.println("Digite o NUMERADOR:");
        numerador = input.nextDouble();

        System.out.println("Digite a Operação:");
        op = input.next();

        System.out.println("Digite o DENOMINADOR");
        denominador = input.nextDouble();


        if(op.equals("+")){
           somarNumeros();
            System.out.println("O resultado é: " + resultado);
        } else if(op.equals("-")){
            subtrairNumeros();
            System.out.println("O resultado é: " + resultado);
        } else if(op.equals("*")){
            multiplicarNumeros();
            System.out.println("O resultado é: " + resultado);
        } else if(op.equals("/")){
            dividirNumeros();
            System.out.println("O resultado é: " + resultado);
        }
    }

    public double somarNumeros(){
       resultado = numerador + denominador;
       return  resultado;
    }
    public double subtrairNumeros(){
        resultado = numerador - denominador;
        return  resultado;
    }
    public double multiplicarNumeros(){
        resultado = numerador * denominador;
        return  resultado;
    }

    public double dividirNumeros(){
        resultado = numerador / denominador;
        return  resultado;
    }



}
