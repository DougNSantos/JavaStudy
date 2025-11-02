package HerancaPolimorfismo;

public class Lion extends Feline{

    @Override
    public void makeNoise(){
        System.out.println("Roar, Roar");
    }

    @Override
    public void eat(){
        System.out.println("Meat");
    }

}
