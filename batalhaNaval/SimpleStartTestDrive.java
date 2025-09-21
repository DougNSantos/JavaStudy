package batalhaNaval;

public class SimpleStartTestDrive {

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
