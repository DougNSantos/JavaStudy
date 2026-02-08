package PolimorfismoNaPratica;

//segunda versão usando polimorfismo na prática, agora com classe genérica para animais e podendo adicionar qualuqer classe...
//que extenda de animal em nosso array de animais, não restringindo apenas para dogs!!!

public class MyAnimalListTwo {

    //OBS: Aqui, a classe animal poderia ser abstrata, então não podemos instanciar ela...
    //mas aqui estamos instanciado um novo objeto ARRAY e pasando o tipo de array com animal, por isso ele pode receber classes abstratas como tipos de array!!!
    private Animal[] listAnimal = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a){
        //se ainda não estivermos no limite do array de animal, ele adionará mais um
        if (nextIndex < listAnimal.length){
            listAnimal[nextIndex] = a;
            System.out.println("Animal adicinado em: " + nextIndex);
            nextIndex ++;
        }
        else {
            System.out.println("Lista cheia");
        }
    }

}