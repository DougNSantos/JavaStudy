package Exercises;

//A PARTIR DE DADOS FORNECIDOS PELO USUARIO, CALCULE O VALOR DA VENDA DE UM PRODUTO, EXIBINDO:
//UMA SAÍDA COM CÓDIGO DO PRODUTO, NOME, QUANTIDADE COMPRADA E VALOR UNITÁRIO E O VALOR TOTAL

import java.util.Scanner;

public class venda {

    Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int resposta = 0;
        int quantidade = 0;
        int valorTotal = 0;
        
        venda vend = new venda();
        resposta = vend.menu();
        quantidade = vend.quantidade();

        if (resposta == 1){
            System.out.println("Nome = TV");
            System.out.println("Código = " + resposta);
            System.out.println("Quantidade = " + quantidade);
            System.out.println("Valor unitario = " + 500);
            valorTotal = 500 * quantidade;
            System.out.println("Valor Total = " + valorTotal);
        }
        else if (resposta == 2){
            System.out.println("Nome = Rádio");
            System.out.println("Código = " + resposta);
            System.out.println("Quantidade = " + quantidade);
            System.out.println("Valor unitario = " + 300);
            valorTotal = 300 * quantidade;
            System.out.println("Valor Total = " + valorTotal);
        }
        else if (resposta == 3){
            System.out.println("Nome = PlayStation 5");
            System.out.println("Código = " + resposta);
            System.out.println("Quantidade = " + quantidade);
            System.out.println("Valor unitario = " + 1500);
            valorTotal = 1500 * quantidade;
            System.out.println("Valor Total = " + valorTotal);
        }
        else{
            System.out.println("numero incorreto!");
        }

        vend.leia.close();
    }

    public int menu(){  

        String[] produtos = new String[3];
        produtos[0] = "TV";
        produtos[1] = "Rádio";
        produtos[2] = "PS5";         

        int escolha = 0;        

        System.out.println("ESCOLHA: \n");

        for (int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i]);
        }       

        escolha = leia.nextInt();
        

        return escolha; 
               
    }

    public int quantidade(){
        
        int quantidade = 0;

        System.out.println("informe a quantidade: ");        

        quantidade = leia.nextInt();
        

        return quantidade;
    }
    
}
