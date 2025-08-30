public class Dog {

    String nome, raca;
    int tamanho;

    public void Latir(){
        System.out.println(this.nome + " = WoooF WoooF");
    }

    //aqui já estamos usando encapsulamento para atribuir valores
    //Mas não declaramos as variáveis de instância com private, então ainda assim...
    //conseguimos atribuir sem encapsulamento!
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return this.tamanho;
    }

}
