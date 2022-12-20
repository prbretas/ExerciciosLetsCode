package AULA201222;

import java.util.Scanner;

public class AlunoUFSC extends Pessoa{
    Scanner input = new Scanner(System.in);
    private double _prova1;
    private double _prova2;
    private double _prova3;


    public double get_prova1() {
        return _prova1;
    }

    public void set_prova1(double prova1) {
        this._prova1 = prova1;
    }

    public double get_prova2() {
        return _prova2;
    }

    public void set_prova2(double prova2) {
        this._prova2 = prova2;
    }

    public double get_prova3() {
        return _prova3;
    }

    public void set_prova3(double prova3) {
        this._prova3 = prova3;
    }


    @Override
    public String toString() {
        return "Aluno UFSC: {" +
                "\nProva 1 = " + _prova1 +
                ",\nProva 2 = " + _prova2 +
                ",\nProva 3 = " + _prova3 +
                "\nMedia = " + calcMedia() + '}';
    }

    public double calcMedia(){
        double media = (_prova1 + _prova2 )/2;
        if(media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Informe a terceira prova");
            _prova3 = input.nextDouble();
            if(_prova3>=7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Você está Reprovado");
            }
        }
        return 0;
    }
// Construtor VAZIO -> permite a criação instanciando um objeto vazio
    public AlunoUFSC(){

    }

    // Construtor CHEIO -> permite a instanciação de objeto com valores
    //no mesmo tempo da criação
        public AlunoUFSC(double prova1, double prova2, double prova3){
        this._prova1 = prova1;
        this._prova2 = prova2;
        this._prova3 = prova3;

    }


}
