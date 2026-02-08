package PolimorfismoNaPratica;

//primeira versão de estudo com polimorfismo na prática, usando apenas objetos Dog

public class MyDogListOne {

    //variáveis de instância
    //array simples com 5 posições de objetos do tipo Dog()

    private Dog[] listDog = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d){
        //se ainda não estivermos no limite do array de dog, ele adionará mais um
        if (nextIndex < listDog.length){
            listDog[nextIndex] = d;
            System.out.println("Dog adicinado");
            nextIndex ++;
        }
        else {
            System.out.println("Lista cheia");
        }
    }

}
