package AdvancedDestroyStartups;

import java.util.ArrayList;

public class Startup {

    private String name;
    private ArrayList<String> posicoes;    

    public void configPosicoes(ArrayList<String> pos){
        posicoes = pos;
    }

    public String palpite(String chuteUsuario){
        String resultado = "errou";
        
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

    public void setName(String name){
        this.name = name;
    }
}