package DestroyStartups;

//importamos para usar o ArrayList
//declaramos assim: ArrayList<tipo parametrizado> nome = new ArrayList<>();
//os arrays comuns usam estruturas exclusivas deles em java, ex: array[5]...
//ArrayLists usam padrões de objetos, por isso temos métodos em ArayLists! ex: arrayList.add(), arrayList.remove()...
import java.util.ArrayList;

public class Startup {

    private ArrayList<String> posicoes;    

    //nesses colchetes angulares vão Tipos Parametrizados!
    //quer dizer que ArrayList são parametrizados!!!
    public void configPosicoes(ArrayList<String> pos){
        posicoes = pos;
    }

    public String palpite(String chuteUsuario){
        String resultado = "errou";

        //o indexOf() verifica se o valor está presente no array e em qual índice do array ele está, se não estiver: ele retorna o valor de -1, se tiver: ele retorna o valor do índice da primeira ocorrencia  daquele valor no array.
        int index = posicoes.indexOf(chuteUsuario);
        if (index >= 0){
            posicoes.remove(index);    
            if (posicoes.isEmpty()){
                resultado = "destruiu";
            }
            else{
                resultado = "acertou";
            }
        }
        return resultado;
    }
}
