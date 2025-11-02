package HerancaPolimorfismo;

public class Feline extends Animal{

    //a keyword para sobrescrever um método da superclasse é @Override
    @Override
    public void roam(){
        System.out.println("Jumping");
    }

}
