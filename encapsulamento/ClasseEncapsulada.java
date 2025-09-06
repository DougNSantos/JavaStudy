package encapsulamento;

//agora com uso de private na frente das variaveis, (modificadores de visibilidade)
//podemos usar os métodos para settar e pegar os valores das variaveis de instancia, encapsulando os dados da classe
public class ClasseEncapsulada {
    private String name;
    private int size;

    //Já que temos nossas variáveis como private...
    //nossos métodos de acesso a elas deverá ser public!!!
    //retorna o nome
    public String getName(){
        return this.name;
    }

    //atribui o nome
    public void setName(String nameParameter){
        this.name = nameParameter;
    }

    //retorna o tamanho
    public int getSize(){
        return this.size;
    }

    //atribui o tamanho
    //Usando encapsulamento, podemos ter controle do que o usuário poderá fazer com os valores da classe!!!
    //Por exemplo, aqui se o valor de argumento passado a variável size ser menor do que 5, o método não deixará atribuir o valor!!!
    //TEMOS CONTROLE DO QUE PODE E O QUE NÃO PODE NAS VARIÁVEIS DE INSTÂNCIA DE NOSSAS CLASSES!!!
    public void setSize(int sizeParameter){
        if(sizeParameter > 5){
            this.size = sizeParameter;
        }
        else{
            System.out.println("Argumento inválido");
        }
        
    }
}
