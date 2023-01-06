package AulasClass.Polimorfismo;

class SistemaSeguranca{
    public void desligar(Car car) {
        car.desligar();
    }

    public void desligar(Motorcycle motorcycle) {
        motorcycle.desligar();
    }

    public void desligar(Bus onibus) {
        onibus.desligar();
    }

    public void desligar(Plane plane) {
        plane.desligar();
    }


}
