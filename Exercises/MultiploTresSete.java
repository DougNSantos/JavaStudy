package Exercises;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Com um valor fornecido pelo usuario, verifique se ele é múltiplo de 3 ou de 7,
mostre uma mensagem para o usuario com o número digitado e o resultado do teste.
*/

public class MultiploTresSete {

    public static void main(String[] args){

        MultiploTresSete programa = new MultiploTresSete();
        programa.executar();

    }

    public void executar(){

        Scanner entrada = new Scanner(System.in);

        float valorUsuario = 0f;

        valorUsuario = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));

        if ( valorUsuario % 3 == 0 && valorUsuario % 7 == 0 ){
            JOptionPane.showMessageDialog(null, "Seu valor: " + valorUsuario + " é múltiplo de 3 e de 7!");
        }
        else {
            if ( valorUsuario % 3 == 0 ) {
                JOptionPane.showMessageDialog(null, "Seu valor: " + valorUsuario + " é múltiplo de 3!");
            }
            else if ( valorUsuario % 7 == 0 ){
                JOptionPane.showMessageDialog(null, "Seu valor: " + valorUsuario + " é múltiplo de 7!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Seu valor: " + valorUsuario + " não é múltiplo de 3 e nem de 7!");
            }
        }

    }

}
