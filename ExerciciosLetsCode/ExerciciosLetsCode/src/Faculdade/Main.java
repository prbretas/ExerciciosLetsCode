package Faculdade;

/*Construir uma app de calculo de notas de um aluno
 * sabendo que ele pode ser aluno da Univille ou da UFSC
 * e possuem formas de avaliação diferente.
 * Mostrar os dados e a média do aluno
 */

//HERANÇA - possibilidade de se reutilizar os atributos e metodos
//em outra classe. é possivel fazer herança única,
//não existe herança multipla no JAVA,mas uma classe pode gerar
//várias outras classes-filhas.

// -> SUPER CLASSE - CLASSE MÃE
// -> SUB CLASSE - CLASSE FILHA

public class Main {
    public static void main(String[] args) {

//        //ALUNO UFSC
//        AlunoUFSC aluno1 = new AlunoUFSC();
//        //SETANDO VALORES NO ATRIBUTO PELO SET
//        aluno1.set_nomeAluno("João Da Costa");
//        aluno1.set_matricula("202285195512");
//        //RETORNANDO OS VALORES DO ATRIBUTO PELO GET
//        System.out.println(aluno1.get_nomeAluno());
//        System.out.println(aluno1.get_matricula());
//
//        aluno1.set_prova1(7.468);
//        aluno1.set_prova2(5.96);
//        System.out.println(aluno1.toString());
//        System.out.println(aluno1.calcMedia());
//
//
//        //Instanciando objeto atraves do CONSTRUCTOR CHEIO
//        AlunoUFSC aluno3 = new AlunoUFSC(4,6,8);
//        System.out.println(aluno3.calcMedia());
//
//        System.out.println("--------------------------------");
//        //ALUNO UNIVILLE
//        AlunoUniville aluno2 = new AlunoUniville();
//        aluno2.set_nomeAluno("Carlos José");
//        aluno2.set_matricula("UV87515");
//        System.out.println(aluno2.get_nomeAluno());
//        System.out.println(aluno2.get_matricula());
//        aluno2.set_prova1(8.63);
//        aluno2.set_prova2(7.73);
//        aluno2.set_prova3(6.96);
//        System.out.println(aluno2.toString());
//        System.out.println(aluno2.calcMedia());
//        AlunoUniville aluno4 = new AlunoUniville("João", "UV357139571", 5, 8.9, 9.7);
//        System.out.println(aluno4.calcMedia());



        AlunoUFSC aluno1 = new AlunoUFSC("Luis", "2022-154987910", 6.9, 7.8);
        System.out.println(aluno1.toString());

        AlunoUFSC aluno2 = new AlunoUFSC("Jose", "2022-12541256346", 9.8, 8.8);
        System.out.println(aluno2.toString());

        AlunoUFSC aluno3 = new AlunoUFSC("Carlos", "2022-0662362342", 5.5, 5.7,6.6);
        System.out.println(aluno3.toString());

        AlunoUniville aluno4 = new AlunoUniville("Vitor", "2022#1577912597",
                8, 6,7);
        System.out.println(aluno4.toString());

        AlunoUniville aluno5 = new AlunoUniville("Fabio", "2022#8356924577",
                5, 4,6);
        System.out.println(aluno5.toString());

        AlunoUniville aluno6 = new AlunoUniville("Vitor", "2022#46456894597",
                9, 7,8);
        System.out.println(aluno6.toString());


    }
}
