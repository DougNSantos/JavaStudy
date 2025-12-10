package HerancaPolimorfismo;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        Wolf wolf = new Wolf();

        //chama a versão em Wolf
        wolf.makeNoise();

        //chama a versão em Canine
        wolf.roam();

        //chama a versão em Wolf
        wolf.eat();

        //chama a versão em Animal
        wolf.sleep();

        //ALÉM DE PODERMOS MODIFICAR OS MÉTODOS DAS CLASSES QUE ESTENDEM SUAS SUPERCLASSES...
        //PODEMOS COM O POLIMORFISMO: CRIAR OBJETOS E VINCULAR ELES A SUAS SUPERCLASSES!!!
        //NESTE CASO WOLF ESTENDE ANIMAL, ENTÃO POSSO CIRAR UM OBJETO ANIMAL(SUPERCLASSE) E VINCULAR A WOLF(SUBCLASSE)!!!
        //PARA DECLARAÇÃO DE OBJETOS, FUNCIONA DE SUBCLASSE PARA SUPERCLASSE/ DE BAIXO PARA CIMA NA HIERARQUIA...
        //E PODEMOS CHAMAR OS MÉTODOS DE WOLF QUE A JVM SABE QUAL METODO CHAMAR!!!
        Animal newPolimorf;
        newPolimorf = new Wolf();
        //AQUI ELE CHAMA EXATAMENTE O METODO DE WOLF MESMO SENDO A VARIAVEL DE REFERENCIA DE ANIMAL!!!
       newPolimorf.makeNoise();

       System.out.println(" ");
       System.out.println("AQUI É UM TESTE COM UM ARRAYLIST POLIMÓRFICO!!!");
       System.out.println(" ");

       //usando polimorfismo, podemos aplicar a diferentes estrutuas também!
       //criamos um array do tipo animal, então podemos por nesse suas subclasses que estendem ele!!!
       //assim podemos percorrer esse array e ele vai agir diferente para cada objeto que está ali dentro!!!
       ArrayList<Animal> arrayPolimorfica = new ArrayList<>();
       arrayPolimorfica.add(new Wolf());
       arrayPolimorfica.add(new Cat());
       arrayPolimorfica.add(new Hippo());

       for (Animal myAnimal : arrayPolimorfica) {
           myAnimal.makeNoise();
           myAnimal.roam();
       }

       //USANDO MÉTODOS COM SOBRECARGA:
       //OBS: Pra usar métodos com retorno, esse retorno irá ser armazenado a uma variável, então devemos passar esses métodos...
       //para uma variável!!!

       int soma;
       soma = SobrecargaMetodos.somar(5,10);
       System.out.println(soma);

       double somaDouble;
       somaDouble = SobrecargaMetodos.somar(15.5, 10.7);
       System.out.println(somaDouble);
    }

}
