package Exercises;

//CALCULE A MEDIA DE 3 VALORES

import java.util.Scanner;

public class media {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        //float porque o resultado pode dar quebrado dependendo do valor da divisão
        float media = 0f;

        System.out.println("informe o primeiro valor:");
        int num1 = leia.nextInt();
        System.out.println("informe o segundo valor:");
        int num2 = leia.nextInt();
        System.out.println("informe o terceiro valor:");
        int num3 = leia.nextInt();

        media = (num1+num2+num3)/3;

        System.out.println("Resultado= " + media);

        leia.close();
    }

}
