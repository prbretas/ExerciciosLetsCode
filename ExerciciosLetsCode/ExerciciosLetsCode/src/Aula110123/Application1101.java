package Aula110123;

/*
REGRAS DO JOGO:
1) Pode usar herança (extends)
2) Tem que usar pelo menos uma Interface (implements)
3) Pode alterar a quantidade de arquivos (classes/interfaces)
4) Pode mudar os atributos e método de lugar
5) Pode alterar a obrigatoriedade de atributos e/ou métodos de uma classe ou interface
(EX: Pessoa Jurídica pode andar)
* */

public class Application1101 {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.set_nome("Joao");
        pessoaFisica.set_idade(20);
        pessoaFisica.set_cpf("9494949494");
        pessoaFisica.set_peso(70.6);
        pessoaFisica.set_sexo("Masculino");
        pessoaFisica.andar();
        pessoaFisica.comer();
        pessoaFisica.respirar();
        pessoaFisica.dormir();
        pessoaFisica.pagarImposto(200);


        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.set_cnpj("9849848940001-54");
        pessoaJuridica.pagarImposto(300);




    }
}
