package HerancaPolimorfismo;

public class Wolf extends Canine{

    @Override
    public void makeNoise(){
        System.out.println("Auuuuuu");
    }

    @Override
    public void eat(){
        System.out.println("Meat");
    }

}
