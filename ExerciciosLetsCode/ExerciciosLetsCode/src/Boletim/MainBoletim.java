package Boletim;

import java.util.Scanner;

public class MainBoletim {

    public static void main(String[] args) {
        //Boletim boletim = new Boletim();
        //boletim.entradaDeDados();
        //--------------------------------------------

        Scanner input = new Scanner(System.in);
        Boletim2 aluno1 = new Boletim2();

        aluno1.nome = "João";
        aluno1.disciplina = "Português";
        aluno1.nota1 = 7.8;
        aluno1.nota2 = 8.9;
        aluno1.nota3 = 9.4;
        aluno1.nota4 = 5.7;

        // VOID - ja esta resolvido no metodo, nao precisa colocar system out
        aluno1.calcularMediaVoid();

        // COM RETORNO - tem que escrever com system out
        System.out.println("FUNÇÃO TIPADA: A média do aluno é: " + aluno1.calcularMediaReturn());



        
    }
}
