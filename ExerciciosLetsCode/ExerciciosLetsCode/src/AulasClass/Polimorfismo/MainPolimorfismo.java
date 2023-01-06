package AulasClass.Polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {


        Car carro = new Car("carro", "Nismo 380hp", 45, "flex", 4,
                4, "Nissan", "Skyline-R34", 1999, "blue");
        carro.ligar();
        carro.desligar();
        System.out.println(carro.toString());
        carro.obterTipoDoVeiculo();


        Motorcycle moto = new Motorcycle("moto", "Harley Davidson 820cc", 20,
                "gasoline", 2, 0, "Harley Davidson", "Phantom",
                2010, "black");
        moto.ligar();
        moto.desligar();
        System.out.println(moto.toString());
        moto.obterTipoDoVeiculo();


        Plane aviao = new Plane("aviao", "Airbus Jumbo 918", 3500,
                "querosene", 8, 10, "Airbus", "Jumbo 918",
                2022, "white");
        aviao.ligar();
        aviao.desligar();
        System.out.println(aviao.toString());
        aviao.obterTipoDoVeiculo();


        Bus onibus = new Bus("onibus", "Marcopolo 300hp", 80,
                "diesel", 8, 3, "Marcopolo", "Hr213",
                2016, "yellow");
        onibus.ligar();
        onibus.desligar();
        System.out.println(onibus.toString());
        onibus.obterTipoDoVeiculo();


    }
}
