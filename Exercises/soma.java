package Exercises;
//LER 4 VALORES E CALCULAR A SOMA ENTRE ELES

//posso importar uma vez ou chamar atraves do nome completo da classe, mas daí tenho que digitar mais
//import java.util.Scanner;

public class soma {
    public static void main(String[] args){

        //aqui não estou importando, mas sim usando o nome completo da classe onde eu preciso usar ela:
        //nome do pacote + nome da classe: java.util.Scanner
        java.util.Scanner leia = new java.util.Scanner(System.in);
        int resultado = 0;

        System.out.println("informe primeiro numero: ");        
        int num1 = leia.nextInt();

        System.out.println("segundo valor: ");
        int num2 = leia.nextInt();
        System.out.println("terceiro valor: ");
        int num3 = leia.nextInt();
        System.out.println("quarto valor: ");
        int num4 = leia.nextInt();

        resultado = num1+num2+num3+num4;

        System.out.println("Soma entre todos valores= " + resultado);

        //fecha o scanner
        leia.close();
        
    }
}