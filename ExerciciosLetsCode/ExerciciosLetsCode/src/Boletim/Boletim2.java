package Boletim;

public class Boletim2 {

    //  --------------- ATRIBUTOS ---------------
    String nome;
    String disciplina;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;



    //  -------------- PROPRIEDADES --------------------


    //  -------------- MÉTODOS / FUNÇÕES --------------------
    // VOID - Não tem RETORNO - TEM Q SER RESOLVIDO DENTRO DO METODO
    public void calcularMediaVoid(){
         media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("VOID: A média do aluno é: " + media);
    }

    // ESSE METODO TEM RETORNO DO TIPO DOUBLE
    public double calcularMediaReturn(){
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }





}
