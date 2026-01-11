package Exercises;

public class Gerente extends Funcionario{

    @Override
    double calcularBonus(){
        double bonus = 2000.0;
        return bonus;
    }

    @Override
    String getTipo(){
        return "Gerente";
    }
}
