package AULA141222;
//ORIENTAÇÃO A OBJETOS
//Surgiu da necessidade de se construir programas mais complexos
//com menos linhas de código, utilizando conceitos do mundo real.
/*
Classe PESSOA:
- Nome; - Endereço; - Telefone; - Documento;
Classe Aluno: herda Pessoa;
- Turma; - Serie; - Turno; - MatriculaAluno;
Classe Funcionario: herda Pessoa;
- Turma; - Data de Admissão - Data de Demissão; - Horario de trabalho; - MatriculaFuncionario;
*/

/* CLASSE: é o modelo base onde são definidas as caracteristicas e propriedades da mesma.
ATRIBUTOS -> Variáveis;
PROPRIEDADES ->
MÉTODOS -> Funções;
* */

public class Principal {
    public static void main(String[] args) {
         //CRIAÇÃO DE OBJETO TAB DA CLASSE TABUADA
        //  QUANDO QUISER USAR UMA CLASSE, DEVE SE CRIAR UM OBJETO DA CLASSE
        Tabuada tab = new Tabuada();

        //CHAMADA DOS METODOS DA CLASSE, TODOS DEVEM SER PÚBLICOS.
        //tab.entradaDados();
        //tab.calcularTabuada();


        //instanciar objeto da classe
      //  Calculadora calc = new Calculadora();
     //   calc.entradaDados();

        Boletim boletim = new Boletim();
        boletim.entradaDeDados();

    }

}
