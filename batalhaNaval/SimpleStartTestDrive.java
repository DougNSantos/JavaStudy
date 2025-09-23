package batalhaNaval;

public class SimpleStartTestDrive {

    //Essa assinatura do método main() em Java sempre será com esses argumentos (String[] args)
    //Isso se dá porque o java permite que usemos essa String[] de array chamada args em nosso código
    //Assim podemos chamar nosso programa e já passar parametros para ele, normalmente em terminal é usado isso
    //Mas mesmo que não usemos, o Java vai esperar essa assinatura para rodar nosso código!
    //ex usando dentro de nosso código: String[] vetor1 = new String(args[5]); 
    //--> estou passando o indice [5] de meu array de Strings chamado args que vem de fora de meu programa e já estou...
    //passando para dentro de meu programa
    public static void main(String[] args){

        InicioSimples start = new InicioSimples();

        int[] localCelula = {2,3,4};
        start.configLocalCelulas(localCelula);
        
        int palpite = 2;
        String resultado = start.seuChute(palpite);

        String resultadoTeste = "fail";
        if (resultado.equals("acertou")){
            resultadoTeste = "hit";
        }

        System.out.println(resultadoTeste);

    }   
}
