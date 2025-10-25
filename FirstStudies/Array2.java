public class Array2 {

    //mais estudo com arrays e variáveis de referência
    public static void main(String args[]){

        Dog rex = new Dog();
        System.out.println(rex.nome);

        //aqui, não estamos usando encapsulamento! Por isso estamos acessando e atribuindo valores diretamente atraves do operador ponto(.)
        rex.nome = "REX";

        //obs: não precisamos de um println aqui, pois o método já nos imprime um println!
        rex.Latir();

        //declaramos a variável de referência primeiro...
        //criamos um objeto Array do tipo Dog por segundo e...
        //atribuimos a variável de referência!
        //podemos fazer direto também: Dog[] pets = new Dog[3];
        Dog[] pets;
        pets = new Dog[3];

        //OBS: UM ARRAY ESTÁTICO DEVE TER SEU TAMANHO DEFINIDO!

        int x = 0;
        while ( x < pets.length ) {
            pets[x] = new Dog();
            x = x + 1;
        }

        pets[0].nome = "Rufus";
        pets[1].nome = "Fido";
        pets[2].nome = "Onix";
        
        int y = 0;
        while ( y < pets.length ){
            pets[y].Latir();
            y = y + 1;
        }

    }
}
