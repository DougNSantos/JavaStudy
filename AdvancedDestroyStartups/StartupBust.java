package AdvancedDestroyStartups;

import java.util.ArrayList;

public class StartupBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        Startup one = new Startup();
        Startup two = new Startup();
        Startup three = new Startup();
        one.setName("TECHSAT");
        two.setName("YOKO");
        three.setName("MANDRIL");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Seu desafio é destruir 3 startups");
        System.out.println("TECHSAT, YOKO e MANDRIL");
        System.out.println("Bom Game!");
    

        for (Startup startup : startups){
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.configPosicoes(newLocation);
        }
    }

    private void startPlaying(){
        while (!startups.isEmpty()){
            String userGuess = helper.getUserInput("Digite um chute");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "errou";

        for (Startup startupToTest : startups){
            result = startupToTest.palpite(userGuess);

            if (result.equals("acertou")){
                break;
            }
            if (result.equals("destruiu")){
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Todas as startups foram destruidas");
        if(numOfGuesses <= 18){
            System.out.println("somente te tomou: " + numOfGuesses);

        }
        else{
            System.out.println("te tomou bastante: " + numOfGuesses);

        }
    }

    public static void main(String[] args){
        StartupBust novoJogo = new StartupBust();
        novoJogo.setUpGame();
        novoJogo.startPlaying();
    }

}
