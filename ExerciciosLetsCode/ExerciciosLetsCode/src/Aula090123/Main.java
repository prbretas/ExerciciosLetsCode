package Aula090123;

public class Main {


    public void calcularSalarioFuncionario (Funcionario funcionario) {
        if (funcionario instanceof Gerente) {
            //Calculo para gerente
        } else if (funcionario instanceof Administrador) {
            //Calculo para administrador
        } else {
            System.err.println("A classe nao implementa a InterfaceDAO, " +
                    "nenhum procedimento foi executado");
        }
    }


    public static void main(String[] args) {
        Funcionario func01 = new Funcionario();
        String nome = "Joao";
        }

//-------------------------------------------------------


    }
