package Lista03Lacos;

// Imprime uma escada com o número de degraus informados
public class Exercicio2bResolucaoPROF {
    public static void main(String[] args) {
        final int numero = Integer.parseInt(args[0]); //obs: final faz com q a variavael seja constante


        String escada = "#";
        for(int i = 0; i < numero; i++) {
            System.out.println(escada);
            escada += "#";
        }
    }
}