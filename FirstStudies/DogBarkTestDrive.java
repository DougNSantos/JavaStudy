public class DogBarkTestDrive {
    
    public static void main(String args[]){

        DogBark dog1 = new DogBark();
        DogBark dog2 = new DogBark();
        DogBark dog3 = new DogBark();
        DogBark dog4 = new DogBark();

        dog1.tamanho = 8;
        dog1.nome = "Fido";
        dog2.tamanho = 15;
        dog2.nome = "Rex";
        dog3.tamanho = 25;
        dog3.nome = "Alex";
        dog4.tamanho = 34;
        dog4.nome = "Ross";
        
        dog1.Latir();
        dog2.Latir();
        dog3.Latir();
        dog4.Latir();

        dog4.LatirComArgumentos(5);
        int quantOssos = dog2.Ossos();
        System.out.println(quantOssos);

    }

}
