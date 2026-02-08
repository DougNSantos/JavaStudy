package PolimorfismoNaPratica;

//usando polimorfismo e testando:

public class PolimorfListTestDrive {

    public static void main(String args[]){

        Dog umDog = new Dog();
        Cat umCat = new Cat();
        MyAnimalListTwo listaAnimal = new MyAnimalListTwo();

        listaAnimal.add(umCat);
        listaAnimal.add(umDog);

    }

}
