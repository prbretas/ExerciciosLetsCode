
/*
Double vs BigDecimal
Ao trabalhar com dinheiro precisamos de valores exatos, nem 1 centavo a menos nem 1 centavo a mais,
afinal, há muita coisa envolvida neste tipo de processo. Quando trabalhamos com Double (seja o
Double wrapper ou mesmo o double tipo primitivo) não há uma precisão de casas decimais que precisamos,
podemos perceber isso em somas simples onde o resultado deveria ser simples, mas acaba sendo estranho e confuso.
 */


package AulasClass;

import java.math.BigDecimal;

public class BDecimalLesson {

    public static void main(String[] args) {

        System.out.println("Subtrai");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

        System.out.println("");
        System.out.println("Soma");
        System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

        System.out.println("");
        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1.3")));

        System.out.println("");
        System.out.println("Divide");
        System.out.println(new BigDecimal("12.00").divide(new BigDecimal("2.00")));

        System.out.println("");
        System.out.println("Máximo");
        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        System.out.println("");
        System.out.println("Mínimo");
        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

        System.out.println("");
        System.out.println("Potência");
        System.out.println(new BigDecimal("2.00").pow(2));

        System.out.println("");
        System.out.println("Multiplica");
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("3.0")));

    }
}
