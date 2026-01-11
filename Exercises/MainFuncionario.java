package Exercises;

public class MainFuncionario {

    public static void main(String[] args){

        //aqui eu dividi as operações para lembrar delas, mas podemos fazer tudo em uma linha só:
        //declaramos uma variavel de referencia de um array de funcionarios chamada func
        Funcionario[] func;
        //inicializamos essa variavel de referencia apontando um array de objetos funcionarios para o compilador criar na Heap, com 3 posições
        func = new Funcionario[3];

        func[0] = new Funcionario();
        func[1] = new Gerente();
        func[2] = new Desenvolvedor();

        //vamos mostrar os bonus de cada classe
        //f é referencia a um objeto da classe pai...
        //por isso ele aceita suas classe e objetos filhas, por causa da herança do polimorfismo
        //PAI -> FILHA : CORRETO

        //variáveis locais devem ser inicializadas antes do uso!
        //mesmo assim, podemos usar variáveis dentro do escopo do laço for, para evitar erros no uso fora dele!!!
        double mostrar = 0.0;
        String tipo = "";
        for (Funcionario f : func){
            mostrar = f.calcularBonus();
            tipo = f.getTipo();
            System.out.println(mostrar + " -> " + tipo);
        }

        System.out.println("\n" +
                "Mesmo usando o tipo Funcionario, o Java deve chamar:\n" +
                "o bônus do Funcionario\n" +
                "o bônus do Gerente\n" +
                "o bônus do Desenvolvedor\n" +
                "Isso é polimorfismo em ação.");

    }

}
