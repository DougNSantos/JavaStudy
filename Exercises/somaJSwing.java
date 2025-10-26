package Exercises;

import javax.swing.JOptionPane;

public class somaJSwing {

    public static void main(String[] args) {

        int soma = 0;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero: "));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto numero: "));

        soma = num1+num2+num3+num4;

        JOptionPane.showMessageDialog(null, "SOMA TOTAL: " + soma);
       
    }
    
}
