package HerancaPolimorfismo;

public class SobrecargaMetodos {

    //A SOBRECARGA NÃO É POLIMORFISMO, POIS NÃO USA AS REGRAS DE "CONTRATO" DA SUPERCLASSE AO SER CRIADOS:

    //USANDO INT:
    public static int somar(int num1, int num2){
        int numberOne = num1;
        int numberTwo = num2;
        int soma = num1+num2;
        return soma;
    }

    //USANDO A SOBRECARGA COM DOUBLE:
    public static double somar(double num1, double num2){
        double numberOne = num1;
        double numberTwo = num2;
        double soma = num1+num2;
        return soma;
    }
}
