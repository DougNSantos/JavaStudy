public class DogBark {
    
    int tamanho;
    String nome;

    void Latir(){
        if(tamanho > 30){
            System.out.println("Woof, Woof");
        }
        else if(tamanho > 20){
            System.out.println("Ruff, Ruff");
        }
        else{
            System.out.println("Yip, Yip");
        }
    }

    void LatirComArgumentos(int x){
        do{
            System.out.println("Au, Au");
            x = x - 1;
        }
        while(x > 0);
    }

    int Ossos(){
        //Se a classe estiver no mesmo pacote ou se pudermos importá-la, podemos usar em nossos métodos dentro de nossas outras classes além da classe main()!!!
        Dog one = new Dog();
        one.nome = "Lyra";
        return 10;
    }
}
