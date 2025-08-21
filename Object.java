import java.util.Scanner;

public class Object {
    public static void main(String[] args){

        Dog doggy = new Dog();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do dog: ");
        doggy.setNome(entrada.nextLine());

        System.out.println("Informe a raça do dog: ");
        doggy.setRaca(entrada.nextLine());

        System.out.println("Informe o tamanho do dog: ");
        doggy.setTamanho(entrada.nextInt());

        System.out.println(doggy.getNome() + "\n"
        + doggy.getRaca() + "\n"
        + doggy.getTamanho());
    }
}
