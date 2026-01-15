package AbstractAndInterfaces;

public class AbstractTest {

    public static void main(String[] args){

        Animal[] anima = new Animal[2];

        Animal a = new Cat();
        Animal b = new Dog();

        anima[0] = a;
        anima[1] = b;

        for (Animal an : anima){
            an.eat();
            an.roar();
            an.sleep();
        }
    }
}
