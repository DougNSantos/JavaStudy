package Exercises;

public class Desenvolvedor extends Funcionario{

    @Override
    double calcularBonus(){
        double bonus = 1200.0;
        return bonus;
    }

    String getTipo(){
        return "Desenvolvedor";
    }

}
