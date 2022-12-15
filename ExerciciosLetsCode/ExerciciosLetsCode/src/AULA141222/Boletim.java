package AULA141222;

import java.util.Scanner;

public class Boletim {
    Scanner input = new Scanner(System.in);
    String nome;
    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;

    public void entradaDeDados() {
        boolean continuar;
        boolean continuar2;
        System.out.println("\n-------------- SEJA BEM VINDO(A) ---------------");
        System.out.println("\n-- Este sistema irá calcular a Média do Aluno --");
        do {
            continuar2 = false;
            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Digite o seu Nome:");
                    nome = input.nextLine();
                    continuar = true;

                    // CHECAR LETRAS DENTRO DO INPUT NOME. CASO TENHA NUMEROS E CHARS ESPECIAIS IRA TRAVAR.
                    for (int i = 0; i < nome.length(); i++) {
                        char letra = nome.charAt(i);
                        if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' ||
                                letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9'
                                || letra == '!' || letra == '@' || letra == '#' || letra == '$' || letra == '%'
                                || letra == '¨' || letra == '&' || letra == '*' || letra == '(' || letra == ')'
                                || letra == '-' || letra == '_' || letra == '=' || letra == '§' || letra == '+'
                                || letra == ',' || letra == '.' || letra == '<' || letra == '>' || letra == ';'
                                || letra == ':' || letra == '?' || letra == '/' || letra == '|' || letra == '{'
                                || letra == '}' || letra == '[' || letra == ']' || letra == 'º' || letra == 'ª'
                                || letra == '"' || letra == '´' || letra == '`' || letra == '^' || letra == '~'
                                || letra == '¹' || letra == '²' || letra == '³' || letra == '£' || letra == '¢'
                                || letra == '¬') {
                            System.out.println("Números ou Simbolos são inválidos!");
                            continuar = false;
                            i = nome.length();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);

            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println("");
                    System.out.println(nome + ", digite a sua Nota de AV1:");
                    nota1 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);

            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println(nome + ", digite a sua Nota de AV2:");
                    nota2 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite uma OPERAÇÃO válida!");
                }
            } while (!continuar);

            do {
                continuar = false;
                try {
                    input = new Scanner(System.in);
                    System.out.println(nome + ", digite a sua Nota de AV3:");
                    nota3 = input.nextDouble();
                    continuar = true;
                } catch (Exception e) {
                    System.out.println("ERRO: Digite um NÚMERO!");
                }
            } while (!continuar);
            calcularMedia(nota1, nota2, nota3, nome);
        } while (!continuar2);
    }

    public static void calcularMedia(double nota1, double nota2, double nota3, String nome) {
        double resultado = (nota1 + nota2 + nota3) / 3;
        System.out.println("A sua média é: " + resultado);

        if (resultado >= 7 && resultado <= 10) {
            System.out.printf("Parabéns %s, você foi APROVADO!", nome);
        } else if (resultado <= 6.99 && resultado >= 6) {
            System.out.printf(" %s, Você está de RECUPERAÇÃO", nome);
        } else if (resultado <= 5.99) {
            System.out.printf("%s, Você está de REPROVADO", nome);
        }
    }
}
