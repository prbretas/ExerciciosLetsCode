package AulasClass.Polimorfismo;

public class Plane extends Vehicle {

    private String _brand;
    private String _model;
    private int _year;
    private String _color;


    public String get_brand() {
        return _brand;
    }

    public void set_brand(String brand) {
        this._brand = brand;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String model) {
        this._model = model;
    }

    public int get_year() {
        return _year;
    }

    public void set_year(int year) {
        this._year = year;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String color) {
        this._color = color;
    }

    public Plane(String tipoVeiculo, String motor, double tanque, String combustivel, int wheels,
               int doors, String brand, String model, int year, String color) {
        super(tipoVeiculo, motor, tanque, combustivel, wheels, doors);
        this._brand = brand;
        this._model = model;
        this._year = year;
        this._color = color;
    }

    public Plane() {
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nPlane{" +
                "\nbrand='" + _brand +
                "\nmodel='" + _model +
                "\nyear=" + _year +
                "\ncolor='" + _color +
                "'\n}";
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Avião...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Avião...");
    }

}
