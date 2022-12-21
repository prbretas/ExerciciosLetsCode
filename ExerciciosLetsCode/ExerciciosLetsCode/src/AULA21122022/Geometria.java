package AULA21122022;

public class Geometria {

    // ------------------------ ATRIBUTOS ------------------------------
    private double _raio;
    private double _ladoA;
    private double _ladoB;
    public double PI = 3.14;

    // ------------------------ SET E GET ------------------------------
    public double get_raio() {
        return _raio;
    }

    public void set_raio(double raio) {
        this._raio = raio;
    }

    public double get_ladoA() {
        return _ladoA;
    }

    public void set_ladoA(double ladoA) {
        this._ladoA = ladoA;
    }

    public double get_ladoB() {
        return _ladoB;
    }

    public void set_ladoB(double ladoB) {
        this._ladoB = ladoB;
    }

    Geometria() {

    }

    public Geometria(double raio, double ladoA, double ladoB) {
        this._raio = raio;
        this._ladoA = ladoA;
        this._ladoB = ladoB;
    }

    // ------------------------ METODOS ------------------------------
    //Cálculo da area Raio (circulo);
    public double calcular(double raio) {
        double calculo = PI * (raio * raio);
        return calculo;
    }

    //Cálculo da area Raio (retângulo);
    public double calcular(double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        return area;
    }

    public double calcular() {
        return 0;
    }


}
