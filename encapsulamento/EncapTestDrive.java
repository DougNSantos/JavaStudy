package encapsulamento;

public class EncapTestDrive {
    
    public static void main(String[] args) {
        
        String objName;

        ClasseEncapsulada test;
        test = new ClasseEncapsulada();

        objName = test.getName();

        //System.out.println(test.getName()); -- poderia fazer assim também, pois o método do println espera um retorno, e esses métodos retornam o que o prntln pode mostrar
        //EM UM LOCAL NO QUAL DETERMINADO VALOR PODE SER USADO, UMA CHAMADA DE MÉTODO QUE RETORNA ESSE TIPO PODE SER APLICADA:
        //EX: em vez de INT X = 3 + 25; use: INT X + one.getSize();
        System.out.println(objName);
        System.out.println(test.getSize());
        //acima, na saida podemos ver a inicialização padrão dessas variaveis, sendo: String = null e int = 0

        test.setName("Dorothy");
        objName = test.getName();
        System.out.println(objName);

        //aqui ele entrará na estrutura if() e não atribuirá o valor do size a nosso objeto!
        test.setSize(3);
        System.out.println(test.getSize());
        //aqui agora ele atribuirá o valor 15 ao nosso objeto!
        test.setSize(15);
        System.out.println(test.getSize());


        ClasseEncapsulada[] arrayEncapsulado;
        arrayEncapsulado = new ClasseEncapsulada[3];

        //OBS IMPORTANTE: DEVEMOS INSTANCIAR OS OBJETOS PARA VINCULAR A CADA VARIÁVEL DE REFERÊNCIA DE NOSSO ARRAY...
        //SENÕA NÃO VAMOS CONSEGUIR USAR OS MÉTODOS DE NOSSOS OBJETOS DENTRO DO ARRAY, TEREMOS APENAS AS VARIÁVEIS DE REFERÊNCIA SEM OBJETOS VINCULADOS!!!
        arrayEncapsulado[0] = new ClasseEncapsulada();
        arrayEncapsulado[0].setName("Bill Balinha");
        arrayEncapsulado[0].setSize(28);
        System.out.println(arrayEncapsulado[0].getName());

        arrayEncapsulado[1] = new ClasseEncapsulada();
        System.out.println(arrayEncapsulado[1].getName());

        test.getName();

    }

}
