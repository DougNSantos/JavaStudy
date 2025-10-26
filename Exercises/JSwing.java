package Exercises;

//usando pacotes da biblioteca API gráfica swing do java
//ela abstrai o uso de biblioteca gráfica e deixa pronto funções e métodos para criarmos intrefaces gráficas simples no java!!!

import javax.swing.JOptionPane;

public class JSwing {

    public static void main(String[] args) {
        String codigo = "";
        codigo = JOptionPane.showInputDialog("Digite o código: ");

        switch (codigo){
            case "1":
            JOptionPane.showMessageDialog(null, "O produto é um caderno");
            break;
            case "2":
            JOptionPane.showMessageDialog(null, "O produto é um PS5");
            break;
            case "3":
            JOptionPane.showMessageDialog(null, "O produto é um Rádio");
            break;
            default:            
            JOptionPane.showMessageDialog(null, "Código Inválido!");
        }
    }    
}
