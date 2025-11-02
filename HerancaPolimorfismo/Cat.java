package HerancaPolimorfismo;

public class Cat extends Feline{

    @Override
    public void makeNoise(){
        System.out.println("Meaw, Meaw");
    }

    @Override
    public void eat(){
        System.out.println("Fish");
    }

}
