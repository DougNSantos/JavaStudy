package DestroyStartups;

import java.util.Random;
import java.util.Scanner;

public class SimpleStart {
     public static void main(String[] args) {
        //variavel para armazenar numero de tentativas
        int numOfGuesses = 0;

        //objeto de random
        Random rng = new Random();
        //objeto Scanner para entrada do usuario
        Scanner entrada = new Scanner(System.in);

        //instancia um objeto de Inicio do jogo
        GameObj start = new GameObj();

        //cria os inteiros para o campo..
        //randomico de 0 a 7, e adiciona mais um para cada outro valor do campo
        //obs: o nextInt() aqui, é inclusivo no primeiro numero e exclusivo no segundo valor, então teremos um resultado de 0 a 5 aqui
        int numRng1 = rng.nextInt(6);
        int numRng2 = numRng1 + 1;
        int numRng3 = numRng2 + 1;

        //instancia um array e atribui os valores para definir o campo
        int[] campo = {numRng1, numRng2, numRng3};

        //passa o array campo como parametro para iniciar as celulas do jogo
        start.configLocalCelulas(campo);

        //variavel booleana para definir se o jogo não acabou
        boolean isAlive = true;

        //enquando isAlive for true, continua o jogo
        while(isAlive){
            int palpite = 0;
            
            System.out.println("Informe seu chute: ");
            palpite = entrada.nextInt();
            
            //chama o método para verificar o palpite do usuario
            String resultado = start.seuChute(palpite);
            numOfGuesses++;

            //verifica se o alvo foi totalmente destruido
            if(resultado.equals("destruido")){
                isAlive = false;
                System.out.println("Numero de tentativas: " + numOfGuesses);

                //enceramos o recurso do scanner aqui!
                entrada.close();
            }
        }
    }    
}
