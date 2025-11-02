package HerancaPolimorfismo;

public class Dog extends Canine{

    @Override
    public void makeNoise(){
        System.out.println("Woof, Woof");
    }

    @Override
    public void eat(){
        System.out.println("Bones");
    }

}
