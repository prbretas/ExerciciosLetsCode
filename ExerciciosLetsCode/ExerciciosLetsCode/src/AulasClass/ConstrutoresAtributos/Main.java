package AulasClass.ConstrutoresAtributos;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.mostrarNoConsole();
        //INCLUINDO INFOS: Alterando atributos atraves dos SET
        carro1.set_id("KLR8415");
        carro1.set_marca("Nissan");
        carro1.set_modelo("Sentra");
        carro1.set_ano(2018);
        carro1.set_cor("Silver");
        carro1.mostrarNoConsole(); // METODO PARA MOSTRAR OBJETO NO CONSOLE

        // Puxando informações pelo GET
        System.out.println(carro1.get_marca());
        System.out.println(carro1.get_modelo());
        System.out.println(carro1.get_ano());
        System.out.println(carro1.get_id());
        System.out.println(carro1.get_cor());


        System.out.println("************************************************");

        // INSTANCIANDO OUTRO OBJETO DA CLASSE CARRO
        Carro carro2 = new Carro("Ford", "Fiesta", 2018, "NGA7904", "Blue");

        // Puxando informações pelo GET
        System.out.println(carro2.get_marca());
        System.out.println(carro2.get_modelo());
        System.out.println(carro2.get_ano());
        System.out.println(carro2.get_id());
        System.out.println(carro2.get_cor());

        // Alterando atributo pelo SET
        carro2.set_modelo("Mustang"); // retornando SOUT com alterações pelo SET
        carro2.mostrarNoConsole(); // METODO PARA MOSTRAR OBJETO NO CONSOLE
        carro2.set_ano(2020); // retornando SOUT com alterações pelo SET
        carro2.set_cor("Silver, Black Stripes"); // retornando SOUT com alterações pelo SET


    }
}
