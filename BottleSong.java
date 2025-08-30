public class BottleSong {
    public static void main(String[] args){
        int bot = 10;
        String word = "garrafas";

        while ( bot > 0 ){
            if ( bot == 1 ){
                word = "garrafa";
            }
            System.out.println("Há " + bot + " " + word + " verde em cima do murro");
            System.out.println("Há " + bot + " " + word + " verde em cima do murro");
            System.out.println("E se uma delas cair?");

            bot = bot -1;

            if ( (bot > 0 && bot != 1) ){
                System.out.println("Haverá " + bot + " " + word + " em cima do muro");
            }
            else if ( bot == 1 ){
                word = "garrafa";
                System.out.println("Haverá apenas " + bot + " " + word + " em cima do muro");
            }                        
        }        
        System.out.println("Não há mais garrafas em cima do muro");        
    }    
}
