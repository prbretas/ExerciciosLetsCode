package AulasClass.Metodos;

public class MediaNotas {

    String nomeDoAluno;
    int idade;
    double primeiroSem;
    double segundoSem;
    double terceiroSem;
    double quartoSem;



    public void imprimirMediaDoAluno(String nomeDoAluno, int idade, double primeiroSem, double segundoSem, double terceiroSem,
                                     double quartoSem) {
        double media = (primeiroSem + segundoSem + terceiroSem + quartoSem) / 4;
        System.out.println("Nome: " + nomeDoAluno);
        System.out.println("Idade: " + idade);
        System.out.printf("Notas: %.2f, %.2f, %.2f, %.2f.\n", primeiroSem, segundoSem, terceiroSem, quartoSem);
        System.out.printf("Média: %.2f ",media);
    }






}
