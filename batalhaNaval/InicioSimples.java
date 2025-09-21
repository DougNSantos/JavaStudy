package batalhaNaval;

public class InicioSimples {

    int[] localCelulas;
    int numAcertos = 0;

    String seuChute(int chute){
        String resultado = "errou";
        for(int celula : localCelulas){
            if(chute == celula){
                resultado = "acertou";
                numAcertos++;
                break;
            }
        }
        if (numAcertos == localCelulas.length){
            resultado = "destruido";
        }
        System.out.println(resultado);
        return resultado;
    }
    
    void configLocalCelulas(int[] local){
        localCelulas = local;
    }

}
