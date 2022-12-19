package Boletim;

import java.util.Scanner;

public class MainBoletim {

    public static void main(String[] args) {
        //Boletim boletim = new Boletim();
        //boletim.entradaDeDados();
        //--------------------------------------------

        Scanner input = new Scanner(System.in);
        Boletim2 aluno1 = new Boletim2();

        // ANTES DE CRIAR O GET E SET
     /* aluno1.nome = "João";
        aluno1.disciplina = "Português";
        aluno1.nota1 = 7.8;
        aluno1.nota2 = 8.9;
        aluno1.nota3 = 9.4;
        aluno1.nota4 = 5.7;
      */

        //ENTRADA DE DADOS VIA SET

        aluno1.setNome("João");
        aluno1.setDisciplina("Matemática");
        aluno1.setNota1(10);
        aluno1.setNota2(7.43);
        aluno1.setNota3(6.75);
        aluno1.setNota4(5.88);

        // ENTRADA DE DADOS VIA SET SCANNER
        System.out.println("Digite o nome do aluno:");
        aluno1.setNome(input.nextLine());
        // SAÍDA DE DADOS VIA GET, usando SOUT
        System.out.println(aluno1.getMedia());

        // VOID - ja esta resolvido no metodo, nao precisa colocar system out
        aluno1.calcularMediaVoid();

        // COM RETORNO - tem que escrever com system out
        System.out.println("FUNÇÃO TIPADA: A média do aluno é: " + aluno1.calcularMediaReturn());


    }
}
