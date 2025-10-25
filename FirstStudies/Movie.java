public class Movie {
    //obs: variaveis usam nome começados em letras minusculas.
    //obs2: variaveis de um objeto são chamados de variaveis de instância!
    //por padrão, um método sem definição de visibilidade(public, private, static...) acaba se tornando public automaticamente.

    //COISAS QUE UM OBJETO CONHECE SOBRE SI MESMO: VARIAVEIS DE INSTÂNCIA:
    String titulo;
    String genero;
    int pontuacao;    

    //COISAS QUE UM OBJETO PODE FAZER SÃO CHAMADAS MÉTODOS:
    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    void setGenero(String genero){
        this.genero = genero;        
    }

    void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }
    //OBS: posso fazer a atribuição de variaveis de instância apenas chamando suas variais: ex= filme.titulo = "hasta la vista";

    void DaOPlay(){
        System.out.println("Dando o play no filme");
    }

}
