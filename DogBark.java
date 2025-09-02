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
        return 10;
    }
}
