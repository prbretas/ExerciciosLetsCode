package Aula090123;
/*
INTERFACES
Se trata de um contrato que grandes aplicações fazem para que o
programador sigam o padrão do projeto definido no inicio do desenvolvimento
1-> Declarar a classe com a palavra Interface
2-> Só pode conter as assinaturas dos métodos, sem corpo.
3-> Não pode ser Instanciadas
4-> A classe que implementa a interface deve implementar todos os seus métodos
5-> Uma classe pode implementar MAIS DE UMA INTERFACE.
ex: public class ContaCorrente extends Conta (HERANÇA)
    public class ContaCorrente implements Conta, Usuario (INTERFACE)

6-> Uma interface pode implementar/extender diversas outras interfaces (ou seja,
 adicionar comportamentos e metodos "a mais", aumentando a obrigatoriedade do "contrato".)
*/

// DATA ACESSE OBJECT -> Banco de Dados(Persistencia)
// CRUD -> Create, Rename, Update, Delete

public interface InterfaceDAO {

    public void salvar(String nome);
    public void criar(String nome);
    public void deletar(int id);
    public void atualizar(int id);



}
