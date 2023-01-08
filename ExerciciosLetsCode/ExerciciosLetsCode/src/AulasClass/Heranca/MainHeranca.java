package AulasClass.Heranca;


public class MainHeranca {
    public static void main(String[] args) {

        Gerente empregado1 = new Gerente("José", "da Silva Gomes",
                "2023-14324", 1899.98);
        empregado1.baterPontoEntrada();
        empregado1.baterPontoSaida();


        System.out.println(empregado1.toString());

        Vendedor empregado2 = new Vendedor("João", "Oliveira Batista",
                "2023-01234", 1458.98);
        empregado2.baterPontoEntrada();
        empregado2.baterPontoSaida();
        System.out.println(empregado2.toString());



    }
}
