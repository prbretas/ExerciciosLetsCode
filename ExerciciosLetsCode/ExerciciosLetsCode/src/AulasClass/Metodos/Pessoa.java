package AulasClass.Metodos;

public class Pessoa {

    String nome;
    String sobrenome;



    //METODO INT
    public String obterNome(){
        String nomeCompleto = nome +" "+ sobrenome;
        return nomeCompleto;
    }



    //METODO VOID
    public void obterNomeVoid(){
        String nomeCompleto = nome +" "+ sobrenome;
        System.out.println("O nome Completo da pessoa é: " + nomeCompleto);

    }

}
