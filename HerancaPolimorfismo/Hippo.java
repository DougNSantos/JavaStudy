package HerancaPolimorfismo;

public class Hippo extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Yuup, Yuup");
    }

    @Override
    public void eat(){
        System.out.println("Plants");
    }

}
