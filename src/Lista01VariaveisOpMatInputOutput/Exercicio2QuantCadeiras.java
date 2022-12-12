package Lista01VariaveisOpMatInputOutput;

public class Exercicio2QuantCadeiras {
    public static void main(String[] args) {


        System.out.println("---------------------------------------");
        System.out.println("Olá seja bem vindo a aplicação");
        System.out.println("---------------------------------------");


        int totalChairPerRow = 8;
        int totalRow = 10;
        int totalChairs = totalRow * totalChairPerRow;
        int reserved = 10;
        int totalreservedPCD = (totalChairs * reserved) / 100;

        System.out.printf("Cada sala de cinema tem %d fileiras e %d cadeiras.\n", totalRow, totalChairPerRow);
        System.out.printf("A capacidade dessa sala é  de %d pessoas, sendo que %d lugares são reservados para PCD's", totalChairs, totalreservedPCD);


    }
}
