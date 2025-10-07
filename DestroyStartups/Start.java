package DestroyStartups;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Start {
     public static void main(String[] args) {
        
        int numOfGuesses = 0;
        
        Random rng = new Random();
        
        Scanner entrada = new Scanner(System.in);
        
        Startup start = new Startup();       
        
        String letra;
        int controle = 0;
        ArrayList<String> posicao = new ArrayList<>();
        while(controle <= 2){
            int numRng = rng.nextInt(6);
            //converte o int em String, faz parte da classe String
            letra = String.valueOf(numRng);
            posicao.add(letra);
            controle++;
        }        
       
        start.configPosicoes(posicao);        
        boolean isAlive = true;
        
        while(isAlive){
            String chuteUsuario = "";
            
            System.out.println("Informe seu chute: ");
            chuteUsuario = entrada.nextLine();            
            
            String resultado = start.palpite(chuteUsuario);
            numOfGuesses++;            
            
            if(resultado.equals("destruiu")){
                isAlive = false;
                System.out.println("Numero de tentativas: " + numOfGuesses);               
                entrada.close();
            }
            else{
                System.out.println(resultado);
            }
        }
    }    
}
