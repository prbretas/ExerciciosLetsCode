package AulasClass.Metodos;

public class SomarNumeros {

    //METODO INT
    public int somarDoisNumeros(int numeroUm, int numeroDois) {
        int resultadoDaSoma = numeroUm + numeroDois;
        return resultadoDaSoma;
    }

    //METODO VOID
    public void somar(int numeroUm, int numeroDois) {
        int resultadoDaSoma = numeroUm + numeroDois;
        System.out.printf("O resultado da soma dos números %d e %d é: %d. \n", numeroUm, numeroDois, resultadoDaSoma);
    }


// SOMAR 2 ou 3 NUMEROS INT
    public int somarNumeros(int a, int b) {
        return a + b;
    }

    public int somarNumeros(int a, int b, int c) {
        return a + b + c;
    }


    // SOMAR 2 ou 3 NUMEROS DOUBLE
    public double somarNumeros(double a, double b) {
        return a + b;
    }

    public double somarNumeros(double a, double b, double c) {
        return a + b + c;
    }


}
