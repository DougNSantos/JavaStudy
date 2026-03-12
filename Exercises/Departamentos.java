package Exercises;
import java.util.Scanner;

/*
Uma loja de departamentos está oferecendo diferentes formas de pagamento, conforme as opções
listadas a seguir. Faça um algoritmo que leia o valor total de uma compra e calcule o valor do pagamento final
de acordo com a opção escolhida. Se a escolha for por pagamento parcelado, calcule também o valor da parcela.
Ao final, apresente o valor total e o valor das parcelas.
a) pagamento a vista - 5% desconto
b) pagamento em 3 parcelas - valor não sofre alteração
c) pagamento em 5 parcelas - acréscimo de 2%
d) pagamento em 10 parcelas - acréscimo de 8%
*/

public class Departamentos {

    public static void main(String[] args){

        Departamentos programa = new Departamentos();
        programa.executar();

    }

    public void executar(){

        Scanner leia = new Scanner(System.in);
        float valorFinalCompra = 0f;

        System.out.println("Informe o valor total da compra: ");
        float valorInicialCompra = leia.nextFloat();

        System.out.println("Qual a forma de pagamento?\n" +
                "a) pagamento a vista - 5% desconto\n" +
                "b) pagamento em 3 parcelas - valor não sofre alteração\n" +
                "c) pagamento em 5 parcelas - acréscimo de 2%\n" +
                "d) pagamento em 10 parcelas - acréscimo de 8%");

        leia.nextLine();
        //para pegarmos o primeiro charactere
        char escolha = leia.nextLine().charAt(0);

        switch(escolha){
            //5%
            case 'a':
                float calculo5 = valorInicialCompra * 0.05f;
                valorFinalCompra = valorInicialCompra - calculo5;
                System.out.println("Valor inicial da compra: " + valorInicialCompra);
                System.out.println("Valor final: " + valorFinalCompra);
                break;
            //3 parcelas
            case 'b':
                float calculo3 = valorInicialCompra / 3;
                System.out.println("Valor total da compra: " + valorInicialCompra);
                System.out.println("O valor com 3 parcelas fica: " + calculo3 + " cada parcela");
                break;
            //5 parcelas
            case 'c':
                float calculo52 = valorInicialCompra * 0.02f;
                valorFinalCompra = (valorInicialCompra + calculo52) / 5;
                System.out.println("Valor total da compra: " + (valorInicialCompra + calculo52));
                System.out.println("O valor com 5 parcelas fica: " + valorFinalCompra + " cada parcela");
                break;
            //10 parcelas
            case 'd':
                float calculo10 = valorInicialCompra * 0.08f;
                valorFinalCompra = (valorInicialCompra + calculo10) / 10;
                System.out.println("Valor total da compra: " + (valorInicialCompra + calculo10));
                System.out.println("O valor com 10 parcelas fica: " + valorFinalCompra + " cada parcela");
                break;
            default:
                System.out.println("Opção não válida");
        }

        leia.close();

    }

}
