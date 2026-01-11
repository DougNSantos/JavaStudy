package Exercises;
import java.util.Scanner;

//REAJUSTE SALARIAL DE 8,75% , APARTIR DE DADOS INSERIDOS PELO USUÁRIO, CALCULE O SALÁRIO REAJUSTADO DE UM FUNCIONARIO, EXIBINDO
// COMO RESULTADO SEU NOME, O VALOR DO SALÁRIO ATUAL E O VALOR DO SALÁRIO REAJUSTADO.

public class reajuste {

    public static void main(String[] args){

        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("Me diga seu nome:");
        String nomeFunc = entrada.nextLine();
        System.out.println("Informe seu valor de salário atual: ");
        float salAtual = entrada.nextFloat();

        float reajusteSal = salAtual * (8.75f / 100f);
        float novoSal = salAtual + reajusteSal;

        System.out.println(nomeFunc + "\n"
                + "seu salário anterior era: " + salAtual + "\n"
                + "Agora seu salário será de: " + novoSal);
    }
}
