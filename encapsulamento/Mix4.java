package encapsulamento;

//aqui instanciamos o próprio objeto Mix4 dentro de sua propria classe e isso é possivel!
public class Mix4 {

    //essa é uma variavel de instancia, por isso podemos chamar ela atraves de Mix4.counter
    int counter = 0;

    public static void main(String[] args) {

        int count = 0;
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while (i < 19) { 
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " + mixes[1].counter);        
        
    }

    public int maybeNew(int index){
        if (index < 1) {
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }

}
