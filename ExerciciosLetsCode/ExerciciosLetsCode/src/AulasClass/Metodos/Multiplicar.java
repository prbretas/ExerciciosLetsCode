package AulasClass.Metodos;

public class Multiplicar {

    int numero;


    public int multiplicador(int numero) {
        int resultado = numero * 2;
        return resultado;
    }


    public void multiplicar(double numeroUm, double numeroDois){
        double resultado = numeroUm * numeroDois;
        System.out.printf("O resultado da multiplicação dos números %.3f e %.3f é: %.3f. \n", numeroUm, numeroDois, resultado);

    }

}
