package Exercises;
import java.util.Scanner;
/*
Uma loja está concedendo 10% de desconto em qualquer valor.
Faça um algoritmo que, a partir do valor fornecido,
calcule e exiba o preço atual e o preço com desconto.
*/

//forma mais estruturada de escrever com POO em Java:

public class DezPorcento {

    Scanner leia = new Scanner(System.in);

    //o metodo main() é responsavel apenas para chamar os métodos que realmente vão executar nosso algoritmo
    //o algoritmo não está diretamente dentro do main, mas sim em métodos específicos para isso!
    public static void main(String[] args) {

        DezPorcento programa = new DezPorcento();
        programa.executar();

    }

    public void executar(){

        float valorUsuario = 0f;
        float equacao = 0f;
        float resultado = 0f;
        final float dezPorcento = 0.1f;

        System.out.println("Informe um valor para ser aplicado 10% de desconto automaticamente: ");
        valorUsuario = leia.nextFloat();

        equacao = valorUsuario * dezPorcento;
        resultado = valorUsuario - equacao;

        System.out.println("O valor digitado foi: " + valorUsuario);
        System.out.println("O valor com dez porcento de desconto em cima do valor fornecido é: " + resultado);

    }

}