package Exercises;
import javax.swing.JOptionPane;

/*

Um aluno realizou 3 provas de uma determinada disciplina. Levando em consideração o critério a seguir, faça um programa
que mostre se ele ficou para exame e, em caso positivo, que nota este aluno precisa obter, no exame, para passar de ano.
Média = (prova1+prova2+prova3) / 3
A média deve ser maior ou igual a 7. Se não conseguir, a nova média deve ser:
Final = (média + exame) / 2
A média final para aprovação deve ser maior ou igual a 5.

*/

public class Disciplina {

    public static void main(String[] args){

        Disciplina programa = new Disciplina();
        programa.executar();

    }

    public void executar(){


        Float prova1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a prova 1"));
        Float prova2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a prova 2"));
        Float prova3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a prova 3"));

        Float media1 = (prova1 + prova2 + prova3) / 3;

        JOptionPane.showMessageDialog(null, "a média final foi: " + media1);

        if (media1 >= 7){
            JOptionPane.showMessageDialog(null, "você passou");
        }
        else {

            //10 é o valor mínimo que se dividio por 2, obtemos 5 como resultado, que é o mínimo para passar na segunta prova!
            Float valorTirar = (10 - media1);
            JOptionPane.showMessageDialog(null, "Você ficou para exame, você precisa tirar no mínimo: " + valorTirar);

            Float prova4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do exame final pós prova:"));
            Float media2 = (media1 + prova4) / 2;
            JOptionPane.showMessageDialog(null, "a média 2 foi: " + media2);

            if (media2 >= 5){
                JOptionPane.showMessageDialog(null, "você passou na segunda prova final");
            }
            else if (media2 < 5){
                JOptionPane.showMessageDialog(null, "você não passou");
            }
        }

    }

}
