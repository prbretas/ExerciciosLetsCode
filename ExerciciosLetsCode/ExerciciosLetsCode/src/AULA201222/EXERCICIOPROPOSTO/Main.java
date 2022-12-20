package AULA201222.EXERCICIOPROPOSTO;

/*
*
* EXERCÍCIO: Criar uma aplicação que simule a entrada de dados de um RH,
* sabendo que existem os cargos: EMPREGADO, GERENTE E DESENVOLVEDOR.
*
* A aplicação calcula o salário de cada função, sendo:
GERENTE: salário * horas * dias
DESENVOLVEDOR: horas * 255
EMPREGADO: salário


1 - CLASSE PESSOA
2 -


* Desenvolver a aplicação principal, executando um objeto de cada classe
PESSOA: NOME, TELEFONE, DATA_DE_ADMISSAO
 */
public class Main {
    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Jose", "98878-5204", "25/07/2019");
        System.out.println(pessoa1.toString());

        Gerente gerente1 = new Gerente("Carlos", "98777-8500",
                "28/10/2000", 1200, 6, 15);
        System.out.println(gerente1.toString());
        gerente1.calcSalarioVoid();

        Developer developer1 = new Developer("João", "99784-5179", "14/01/2015", 160);
        System.out.println(developer1.toString());
        developer1.calcSalarioVoid();

        Empregado empregado1 = new Empregado("Valdirene Silva", "99784-2601", "01/01/2010", "Limpeza", 1450.57);
        System.out.println(empregado1.toString());
        empregado1.calcSalarioVoid();


    }
}
