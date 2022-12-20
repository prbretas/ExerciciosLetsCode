package AulasClass.Metodos;

public class MainMetodos {
    public static void main(String[] args) {

        // -----------------  CLASS SOMAR NUMEROS  --------------------------------
        SomarNumeros somarNum = new SomarNumeros();
        // CHAMADA METODO INT
        System.out.println(somarNum.somarDoisNumeros(5, 6)); // Usar o Sout pq o metodo é int
        // CHAMADA METODO VOID
        somarNum.somar(10, 7); // chamo o metodo somar pq é void, Sout dentro do metodo


        somarNum.somarNumeros(2,5);
        somarNum.somarNumeros(2,5, 6);
        somarNum.somarNumeros(2.6,5.87);
        somarNum.somarNumeros(2.6,5.87, 6.10);


        // -----------------  CLASS PESSOA  --------------------------------
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.sobrenome = "Carlos";
        System.out.println(pessoa1.obterNome());
        pessoa1.obterNomeVoid();

        // -----------------  CLASS MULTIPLICAR  --------------------------------
        Multiplicar multiplicar = new Multiplicar();
        System.out.println(multiplicar.multiplicador(6));
        multiplicar.multiplicar(6, 7);
        int resultado1 = multiplicar.multiplicador(2);
        int resultado2 = multiplicar.multiplicador(4);
        int resultado3 = multiplicar.multiplicador(5);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

        // -----------------  CLASS MEDIA NOTAS  --------------------------------
        MediaNotas mediaNotas = new MediaNotas();
        mediaNotas.imprimirMediaDoAluno("Philippe", 30, 9.75, 8.8, 8.6, 7.4);

        mediaNotas.nomeDoAluno  = "João";
        mediaNotas.idade = 15;
        mediaNotas.primeiroSem = 7.434;
        mediaNotas.segundoSem = 9.4235;
        mediaNotas.terceiroSem = 8.462;
        mediaNotas.quartoSem = 5.2314;

        System.out.println(mediaNotas.nomeDoAluno);
        System.out.println(mediaNotas.idade);
        System.out.println(mediaNotas.primeiroSem);
        System.out.println(mediaNotas.segundoSem);
        System.out.println(mediaNotas.terceiroSem);
        System.out.println(mediaNotas.quartoSem);


    }
}
