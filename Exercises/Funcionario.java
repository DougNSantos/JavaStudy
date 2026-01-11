package Exercises;

//Você deve criar um sistema simples de Funcionários.
//Classe base--
//Crie uma classe chamada Funcionario que tenha:
//um método chamado calcularBonus()
//esse método retorna um double
//o valor padrão do bônus é 500.0
//Classes filhas--
//Crie duas classes que herdam de Funcionario:
//==Gerente
//sobrescreve o método calcularBonus()
//retorna 2000.0
//==Desenvolvedor
//sobrescreve o método calcularBonus()
//retorna 1200.0
//Classe principal--
//Crie uma classe Main com o método main que:
//Cria um array de Funcionario
//Dentro do array, coloque:
//um Funcionario
//um Gerente
//um Desenvolvedor
//Percorra o array com um for
//Para cada funcionário, chame calcularBonus() e imprima o valor
//Importante:
//Use Funcionario como tipo da variável, não o tipo específico do objeto.
//O que você deve observar ao rodar
//Mesmo usando o tipo Funcionario, o Java deve chamar:
//o bônus do Funcionario
//o bônus do Gerente
//o bônus do Desenvolvedor
//Isso é polimorfismo em ação.
//Desafio extra (opcional)--
//Depois que fizer o básico, tente:
//adicionar um método getTipo() sobrescrito em cada classe
//imprimir o tipo do funcionário junto com o bônus

public class Funcionario {

    double calcularBonus(){
        double bonus = 500.0;
        return bonus;
    }

    String getTipo(){
        return "Funcionário";
    }

}
