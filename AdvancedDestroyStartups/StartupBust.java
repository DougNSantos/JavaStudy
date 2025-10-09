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
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

}
