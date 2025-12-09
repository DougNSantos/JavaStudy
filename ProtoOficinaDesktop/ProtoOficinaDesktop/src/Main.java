public class Main {

    public static void main(String[] args){
        //invokeLater garante que tudo que seja interface, seja craido e usado na thread correta dela!!!
        javax.swing.SwingUtilities.invokeLater(() -> {
           new JanelaPrincipal().setVisible(true);
        });
    }

}
