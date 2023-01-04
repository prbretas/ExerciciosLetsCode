package AulasClass.ModificadoresAcesso;

public class Carro {
    /*
    Modificadores de Controle
    Modificador	         acesso na classe?	 acesso no pacote?	  acesso por herança?	acesso em qualquer lugar?
    public	                    Sim	                 Sim	               Sim	                   Sim
    protected	                Sim	                 Sim	               Sim	                   Não
    sem modificador	            Sim	                 Sim	               Não	                   Não
    private	                    Sim	                 Não	               Não	                   Não

 */


    // public: significa que essa classe está visível em todo nosso projeto.
    public String nome;

    //default: Quando não definimos, a classe assume o padrão, só está visível dentro do pacote onde ela está inserida.
    String modelo;


    //protected: estamos dizendo que além das classes que estão no mesmo pacote,
    // as classes que herdam daquela classe, mesmo que não estejam no mesmo pacote, poderão utiliza-los.
    protected String marca;


    //private: É o mais restrito. Estamos dizendo que somente a própria classe tem acesso àquele atributo.
    private String nomeDono;


    // final: Uma classe anotada com final significa que ela não pode ser herdada por outra classe.
    final class Pessoa {
    }


    //abstract: significa que ela não pode ser instanciada. Para usar uma classe abstrata
    // deve ser herdada e depois instanciada.
    //ex: abstract class Pessoa {}

//--------------------------------------------------------------------------------------------------------------
    // Para os atributos e métodos temos: final, abstract, static, transient, synchronized, volatile.

    //FINAL
    //Um atributo definido como final não pode ter o seu valor alterado.
    // Usa-se o "final" em atributos quando o valor é uma constante.
    // Por exemplo, o número PI, que sempre será 3,14... Já um método definido como final,
    // não pode ser sobrescrito na herança.

    //atributo
    private final double PI = 3.14;

    //metodo
    public final void imprimirVariavelDoSistema() {
        System.out.println(PI);
    }


    //ABSTRACT
    //abstract: A nível de membros, "abstract" só pode ser atribuído a métodos,
    // e somente dentro de uma classe abstrata. Ao definir um método abstrato,
    // ele não tem corpo e deve ser definido pelas classes que herdarem sua classe.
    //Os métodos abstratos não podem ser combinados com private.

    abstract class Funcionario {
        abstract double obterBonus();
    }


    //STATIC
    //Significa que o atributo pertence à classe, e não ao objeto ou instância.

    class Matematica {
        public static final double PI = 3.14;
    }

    //No exemplo acima, não precisamos instanciar nossa classe para ter acesso ao valor da constante PI.
    // Para imprimir esse número, bastaríamos chamar da seguinte forma e já imprimiríamos 3.14.

    // System.out.println(Matematica.PI); -> 3.14
    //Aliás, no próprio exemplo acima já temos um exemplo de um outro atributo estático do Java.
    // Isso mesmo o atributo out da classe System.

  //  public static final PrintStream out = null;
    //A mesma regra se aplica para os métodos:

    class Gerente {
        public static void imprimirTexto(String texto) {
            System.out.println(texto);
        }
    }
    //Chamaremos dessa forma:
        //    Gerente.imprimirTexto("Let's code"); //Let's code
    //Sem precisar instanciar!
    //Então, tenha em mente que ele vai ser executado antes mesmo da instanciação da classe!
    // Ele não pode ter atributos de instância dentro dele.


    //transient
    //Atributos e métodos serão ignorados quando o objeto for serializado (transformado em array de
    // bytes para transmissão em rede).

    //synchronized
    //Os métodos só podem ser usados por uma thread por vez.

    //volatile
    //O valor do atributo nunca é colocado no cache interno da thread.
    // Então, ele sempre é carregado da memória principal.


}
