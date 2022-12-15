package AULA141222;

import java.util.Scanner;

public class MediaIdade {
    Scanner input = new Scanner(System.in);
    String nome1;
    String nome2;
    String nome3;
    String nome4;
    String nome5;

    int op;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double nota5;

    double resultado;


    public void entradaDados() {
        boolean continuar;
        boolean continuar2;

        do {
            continuar2 = false;

            //PESSOA 1
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Digite o nome da 1ª pessoa:");
                    nome1 = input.nextLine();
                    System.out.println("A pessoa 1 se chama: " + nome1);
                    continuar = true;

                    // CHECAR LETRAS DENTRO DO INPUT NOME. CASO TENHA NUMEROS E CHARS ESPECIAIS IRA TRAVAR.
                    for (int i = 0; i < nome1.length(); i++) {
                        char letra = nome1.charAt(i);
                        if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9' || letra == '!' || letra == '@' || letra == '#' || letra == '$' || letra == '%' || letra == '¨' || letra == '&' || letra == '*' || letra == '(' || letra == ')' || letra == '-' || letra == '_' || letra == '=' || letra == '§' || letra == '+' || letra == ',' || letra == '.' || letra == '<' || letra == '>' || letra == ';' || letra == ':' || letra == '?' || letra == '/' || letra == '|' || letra == '{' || letra == '}' || letra == '[' || letra == ']' || letra == 'º' || letra == 'ª' || letra == '"' || letra == '´' || letra == '`' || letra == '^' || letra == '~' || letra == '¹' || letra == '²' || letra == '³' || letra == '£' || letra == '¢' || letra == '¬') {
                            System.out.println("Números ou Simbolos são inválidos!");
                            continuar = false;
                            i = nome1.length();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            //NOTA 1
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite a sua nota:");
                    nota1 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            System.out.printf("A nota do %s é %.2f", nome1, nota1);

            //PESSOA 2
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Digite o nome da 2ª pessoa:");
                    nome2 = input.nextLine();
                    System.out.println("A pessoa 2 se chama: " + nome2);
                    continuar = true;


                    // CHECAR LETRAS DENTRO DO INPUT NOME. CASO TENHA NUMEROS E CHARS ESPECIAIS IRA TRAVAR.
                    for (int i = 0; i < nome2.length(); i++) {
                        char letra = nome2.charAt(i);
                        if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9' || letra == '!' || letra == '@' || letra == '#' || letra == '$' || letra == '%' || letra == '¨' || letra == '&' || letra == '*' || letra == '(' || letra == ')' || letra == '-' || letra == '_' || letra == '=' || letra == '§' || letra == '+' || letra == ',' || letra == '.' || letra == '<' || letra == '>' || letra == ';' || letra == ':' || letra == '?' || letra == '/' || letra == '|' || letra == '{' || letra == '}' || letra == '[' || letra == ']' || letra == 'º' || letra == 'ª' || letra == '"' || letra == '´' || letra == '`' || letra == '^' || letra == '~' || letra == '¹' || letra == '²' || letra == '³' || letra == '£' || letra == '¢' || letra == '¬') {
                            System.out.println("Números ou Simbolos são inválidos!");
                            continuar = false;
                            i = nome2.length();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            //NOTA 2
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite a sua nota:");
                    nota2 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            System.out.printf("A nota do %s é %.2f", nome2, nota2);


            //PESSOA 3
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Digite o nome da 3ª pessoa:");
                    nome3 = input.nextLine();
                    System.out.println("A pessoa 3 se chama: " + nome3);
                    continuar = true;


                    // CHECAR LETRAS DENTRO DO INPUT NOME. CASO TENHA NUMEROS E CHARS ESPECIAIS IRA TRAVAR.
                    for (int i = 0; i < nome3.length(); i++) {
                        char letra = nome3.charAt(i);
                        if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9' || letra == '!' || letra == '@' || letra == '#' || letra == '$' || letra == '%' || letra == '¨' || letra == '&' || letra == '*' || letra == '(' || letra == ')' || letra == '-' || letra == '_' || letra == '=' || letra == '§' || letra == '+' || letra == ',' || letra == '.' || letra == '<' || letra == '>' || letra == ';' || letra == ':' || letra == '?' || letra == '/' || letra == '|' || letra == '{' || letra == '}' || letra == '[' || letra == ']' || letra == 'º' || letra == 'ª' || letra == '"' || letra == '´' || letra == '`' || letra == '^' || letra == '~' || letra == '¹' || letra == '²' || letra == '³' || letra == '£' || letra == '¢' || letra == '¬') {
                            System.out.println("Números ou Simbolos são inválidos!");
                            continuar = false;
                            i = nome3.length();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            //NOTA 3
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite a sua nota:");
                    nota3 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            System.out.printf("A nota do %s é %.2f", nome3, nota3);


            //PESSOA 4
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Digite o nome da 4ª pessoa:");
                    nome4 = input.nextLine();
                    System.out.println("A pessoa 4 se chama: " + nome4);
                    continuar = true;

                    // CHECAR LETRAS DENTRO DO INPUT NOME. CASO TENHA NUMEROS E CHARS ESPECIAIS IRA TRAVAR.
                    for (int i = 0; i < nome4.length(); i++) {
                        char letra = nome4.charAt(i);
                        if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9' || letra == '!' || letra == '@' || letra == '#' || letra == '$' || letra == '%' || letra == '¨' || letra == '&' || letra == '*' || letra == '(' || letra == ')' || letra == '-' || letra == '_' || letra == '=' || letra == '§' || letra == '+' || letra == ',' || letra == '.' || letra == '<' || letra == '>' || letra == ';' || letra == ':' || letra == '?' || letra == '/' || letra == '|' || letra == '{' || letra == '}' || letra == '[' || letra == ']' || letra == 'º' || letra == 'ª' || letra == '"' || letra == '´' || letra == '`' || letra == '^' || letra == '~' || letra == '¹' || letra == '²' || letra == '³' || letra == '£' || letra == '¢' || letra == '¬') {
                            System.out.println("Números ou Simbolos são inválidos!");
                            continuar = false;
                            i = nome4.length();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            //NOTA 4
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite a sua nota:");
                    nota4 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            System.out.printf("A nota do %s é %.2f", nome4, nota4);


            //PESSOA 5
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Digite o nome da 5ª pessoa:");
                    nome5 = input.nextLine();
                    System.out.println("A pessoa 5 se chama: " + nome5);
                    continuar = true;


                    // CHECAR LETRAS DENTRO DO INPUT NOME. CASO TENHA NUMEROS E CHARS ESPECIAIS IRA TRAVAR.
                    for (int i = 0; i < nome5.length(); i++) {
                        char letra = nome5.charAt(i);
                        if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9' || letra == '!' || letra == '@' || letra == '#' || letra == '$' || letra == '%' || letra == '¨' || letra == '&' || letra == '*' || letra == '(' || letra == ')' || letra == '-' || letra == '_' || letra == '=' || letra == '§' || letra == '+' || letra == ',' || letra == '.' || letra == '<' || letra == '>' || letra == ';' || letra == ':' || letra == '?' || letra == '/' || letra == '|' || letra == '{' || letra == '}' || letra == '[' || letra == ']' || letra == 'º' || letra == 'ª' || letra == '"' || letra == '´' || letra == '`' || letra == '^' || letra == '~' || letra == '¹' || letra == '²' || letra == '³' || letra == '£' || letra == '¢' || letra == '¬') {
                            System.out.println("Números ou Simbolos são inválidos!");
                            continuar = false;
                            i = nome5.length();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            //NOTA 5
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("Digite a sua nota:");
                    nota5 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            System.out.printf("A nota do %s é %.2f", nome5, nota5);

            System.out.println();
            System.out.println("--------------------------");
            System.out.printf("-> %s - %.2f", nome1 , nota1);
            System.out.printf("\n-> %s - %.2f",nome2, nota2);
            System.out.printf("\n-> %s - %.2f",nome3, nota3);
            System.out.printf("\n-> %s - %.2f",nome4, nota4);
            System.out.printf("\n-> %s - %.2f",nome5, nota5);

            calcularMedia(nota1, nota2, nota3, nota4, nota5);

        } while (!continuar2);
    }


    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4, double nota5) {
        double resultado = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.printf("\nA média das notas é %.2f:", resultado);
        System.out.println("\n-------------------------------------");
        return resultado;
    }

}
