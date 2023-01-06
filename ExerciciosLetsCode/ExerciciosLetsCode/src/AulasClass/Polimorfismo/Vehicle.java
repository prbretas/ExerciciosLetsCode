package AulasClass.Polimorfismo;

public abstract class Vehicle {

    private String _tipoVeiculo;
    private String _motor;

    private double _tanque;
    private String _combustivel;
    private int _wheels;
    private int _doors;

    public String get_tipoVeiculo() {
        return _tipoVeiculo;
    }

    public void set_tipoVeiculo(String tipoVeiculo) {
        this._tipoVeiculo = tipoVeiculo;
    }

    public String get_motor() {
        return _motor;
    }

    public double get_tanque() {
        return _tanque;
    }

    public void set_tanque(double tanque) {
        this._tanque = tanque;
    }

    public void set_motor(String motor) {
        this._motor = motor;


    }

    public String get_combustivel() {
        return _combustivel;
    }

    public void set_combustivel(String combustivel) {
        this._combustivel = combustivel;
    }

    public int get_wheels() {
        return _wheels;
    }

    public void set_wheels(int wheels) {
        this._wheels = wheels;
    }

    public int get_doors() {
        return _doors;
    }

    public void set_doors(int doors) {
        this._doors = doors;
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "\ntipoVeiculo='" + get_tipoVeiculo() +
                "\nmotor='" + get_motor() +
                "\ntanque=" + get_tanque() +
                "\ncombustivel='" + get_combustivel() +
                "\nwheels=" + get_wheels() +
                "\ndoors=" + get_doors() +
                "\n}";
    }


    public Vehicle(String tipoVeiculo, String motor, double tanque, String combustivel, int wheels, int doors) {
        this._tipoVeiculo = tipoVeiculo;
        this._motor = motor;
        this._tanque = tanque;
        this._combustivel = combustivel;
        this._wheels = wheels;
        this._doors = doors;
    }

    public Vehicle(){}

    public void ligar() {
        //logica para ligar qualquer veículo
        System.out.println("Ligando Veiculo...");
    }

    public void desligar() {
        //logica para desligar qualquer veiculo
        System.out.println("Ligando Veiculo...");
    }

    public void acelerar() {
        //logica para ligar qualquer veículo
        System.out.println("Ligando Veiculo...");
    }

    public void frear() {
        //logica para ligar qualquer veículo
        System.out.println("Ligando Veiculo...");
    }

    public void obterTipoDoVeiculo() {
        if (get_tipoVeiculo().equals("carro")) {
            System.out.println("O veículo é um Carro");
        } else if (get_tipoVeiculo().equals("moto")) {
            System.out.println("O veículo é uma Moto");
        } else if (get_tipoVeiculo().equals("aviao")) {
            System.out.println("O veículo é uma Avião");
        } else if (get_tipoVeiculo().equals("onibus")) {
            System.out.println("O veículo é uma Ônibus");
        } else{

            System.out.println("É um veículo ");
        }

    }


}



