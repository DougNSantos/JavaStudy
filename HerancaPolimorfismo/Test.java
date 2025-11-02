package HerancaPolimorfismo;

public class Test {

    public static void main(String[] args){

        Wolf wolf = new Wolf();

        //chama a versão em Wolf
        wolf.makeNoise();

        //chama a versão em Canine
        wolf.roam();

        //chama a versão em Wolf
        wolf.eat();

        //chama a versão em Animal
        wolf.sleep();

    }

}
