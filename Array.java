public class Array {
    
    //obs: acabei criando esse método, pois o Java não permite deixar estruturas "SOLTAS" dentro de uma classe!!!
    public void TesteArray(){

        //um array é um objeto também
        //arrays são sempre objetos, seja para armazenar variaveis primitivas ou de referencia!!!
        //obs: devo deixar a delaração e inicialização em uma estrutura que o compilador entenda, não pode ser solto na classe!
        int[] numeros = new int[7];
        int adicionador = 0;

        //posso passar manualmente os valores como: numeros[0]=1; numeros[1]=2 ...
        //acabei usando a estrutura for() para popular os valores do array
        //aqui, estamos acessando uma propriedade da classe Array, por isso podemos acessá-la apenas usando .length (minusculo!)
        for( int i = 0; i< numeros.length; i++ ){
            numeros[i] = i;
        }

        //outra forma de deixar acessar diminuindo um valor do índice do array para i = numeros.length -(1)
        for(int i = 0; i <= ( numeros.length -(1) ); i++){
            System.out.println(numeros[i] + " + ");
        }

        for( int i = 0; i< numeros.length; i++ ){
            adicionador += numeros[i];             
        }        

        System.out.println("O valor total do array é: " + adicionador);

    }

    public void TesteArrayObjteos(){
        //obs: agora posso separar essas atribuições, pois elas não estão SOLTAS na classe, mas sim em um método!
        Dog[] pets;
        pets = new Dog[7];

        for( int i = 0; i < pets.length; i++ ){
            //quer dizer que inicializamos a variaável de referencia, mas ela não contém nenhum objeto referenciado!!! Por isso vamos mandar criar objetos Dog() para cada variável de referência!!!
            pets[i] = new Dog();

            //aqui, nos será mostrado o endereço da memória para esses objetos, já que é o valor armazenado na variável de referencia de Dogs!!!
            System.out.println(pets[i]);
        }
    }
}
