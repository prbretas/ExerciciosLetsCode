package Lista02Condicionais;
import java.util.Scanner;

public class Exercicio2ConversorTemperatura {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        boolean continuar;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Olá seja bem vindo à aplicação!");
        System.out.println("Descrição:\nEste sistema irá fazer a conversão de temperaturas");
        System.out.println();


do{
    continuar = false;
    try{
    System.out.println("----------- Digite a temperatura que deseja converter -------------");
    double temperature = Input.nextDouble(); //Recebe o valor da temperatura
    System.out.println();
    System.out.println("----- Seleciona o tipo da temperatura que deseja converter --------");
    System.out.println("-------------------  1 - Celsius para Farenheit -------------------");
    System.out.println("-------------------  2 - Farenheit para Celsius -------------------");
    double selectTemp = Input.nextDouble();

   if(selectTemp == 1){
        converterCelsiusToFarenheit(temperature);
        System.out.println("-------------------------------------------------------------------");
    } else if(selectTemp == 2){
        converterFarenheitToCelsius(temperature);
        System.out.println("-------------------------------------------------------------------");
    } else {
       System.out.println("Selecione uma opção válida no MENU");

   }

    }catch (RuntimeException e){
    System.out.println("Opção inválida, selecione corretamente a opção no MENU");
    continuar = true;

}

    } while(!continuar);

    }


    //FUNÇÃO - CONVERTER CELSIUS -> FARENHEIT
    static void converterCelsiusToFarenheit(double selectTemp){
        double celsiusToFarenheit = ( selectTemp * 9/5) + 32;
        System.out.printf("A temperatura informada foi %.2fºC,\nrepresenta %.2fºF\n", selectTemp, celsiusToFarenheit);
    }


    //FUNÇÃO - CONVERTER FARENHEIT -> CELSIUS
    static void converterFarenheitToCelsius(double selectTemp){
        double farenheitToCelsius = (selectTemp - 32) * 5 / 9;
        System.out.printf("A temperatura informada foi %.2fºC,\nrepresenta %.2fºF\n", selectTemp, farenheitToCelsius);
    }




}
