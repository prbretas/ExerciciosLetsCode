package AulasClass.ConstrutoresAtributos;

public class Carro {

    // ----------------------------------------- ATRIBUTOS ---------------------------------------------------
    private String _id;
    private int _ano;
    private String _marca;
    private String _modelo;
    private String _cor;

    // ----------------------------------------- GET E SET ---------------------------------------------------
    public String get_id() {
        return _id;
    }

    public void set_id(String id) {
        this._id = id;
        System.out.println("O ID foi alterado para " + id);
    }

    public int get_ano() {
        return _ano;
    }

    public void set_ano(int ano) {
        this._ano = ano;
        System.out.println("O ano foi alterado para " + ano);
    }

    public String get_marca() {
        return _marca;
    }

    public void set_marca(String marca) {
        this._marca = marca;
        System.out.println("A marca foi alterado para " + marca);
    }

    public String get_modelo() {
        return _modelo;
    }

    public void set_modelo(String modelo) {
        this._modelo = modelo;
        System.out.println("O modelo foi alterado para " + modelo);

    }

    public String get_cor() {
        return _cor;
    }

    public void set_cor(String cor) {
        this._cor = cor;
        System.out.println("A cor foi alterada para " + cor);
    }

    //-------------------- CRIAR OBJETO ATRAVES DOS SET --------------------
    public Carro() {

    }

    // ----------------------------------------- CONSTRUCTOR --------------------------------------------------
    //-------------------- CRIAR OBJETO DIRETAMENTE PELO CONSTRUTOR EM ()  --------------------
    public Carro(String marca, String modelo, int ano, String id, String cor) {
        this._marca = marca;
        this._modelo = modelo;
        this._ano = ano;
        this._id = id;
        this._cor = cor;


    }


    // ----------------------------------------- METODOS ---------------------------------------------------
    public void mostrarNoConsole() {
        System.out.println("--------------------------------------");
        System.out.println("--------- Ficha do Automóvel ---------");
        System.out.println("- Marca: " + get_marca() +
                "\n- Modelo: " + get_modelo() +
                "\n- Ano: " + get_ano() +
                "\n- Placa: " + get_id() +
                "\n- Cor: " + get_cor());
        System.out.println("--------------------------------------");
    }


}
