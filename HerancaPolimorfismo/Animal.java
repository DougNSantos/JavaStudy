package HerancaPolimorfismo;

public class Animal {

    String picture;
    String food;
    int hunger;
    int boundaries;
    int location;

    public void makeNoise(){
        System.out.println("Making noises");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public void roam(){
        System.out.println("Walking");
    }
    
}
