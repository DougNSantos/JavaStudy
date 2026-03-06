package Exercises;
import java.util.Scanner;

/*
Verifique se um número fornecido pelo usuário é par ou ímpar,
mostrando o numero fornecido e o resultado
*/

public class ParImpar {

    Scanner leia = new Scanner(System.in);

    public static void main(String[] args){

        ParImpar programa = new ParImpar();
        programa.executar();

    }

    public void executar(){

        float valorUsuario = 0f;
        float resultado = 0f;

        System.out.println("digite um valor para compararmos se é par ou ímpar:");
        valorUsuario = leia.nextFloat();

        //usamos a operação %(módulo) que nos retorna a sobra da divisão pelo número que colocarmos após, assim sabemos se um número é par ou ímpar
        resultado = valorUsuario % 2;
        //System.out.println(resultado);

        System.out.println("o valor digitado foi: " + valorUsuario + "\n");

        if (valorUsuario == 0){
            System.out.println("o valor digitado é ZERO");
        }

        if (resultado == 0){
            System.out.println("o valor é PAR");
        }
        else{
            System.out.println("o valor é ÍMPAR");
        }

    }

}
