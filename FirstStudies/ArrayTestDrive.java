public class ArrayTestDrive {
    public static void main(String args[]){
        
        //declaramos uma variavel de referencia com nome de "vetor" para um objeto do tipo Array
        //indicamos para criar um objeto do tipo Array na memória HEAP
        //vinculamos a variavel de referencia que está na STACK chamada "vetor", ao objeto Array que está na HEAP
        //OBS: AQUI O NOME ARRAY SE DÁ A MINHA CLASSE DE NOME ARRAY QUE CRIEI
        Array vetor = new Array();

        vetor.TesteArray();
        vetor.TesteArrayObjteos();

    }
    
}
