package exercicio02;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorProduto1 ,valorProduto2 ,valorProduto3 ,valorProduto4, valorCompra ;
        System.out.println("Informe o valor do produto: ");
        valorProduto1 = entrada.nextDouble();
        System.out.println("Informe o valor do produto: ");
        valorProduto2 = entrada.nextDouble();
        System.out.println("Informe o valor do produto: ");
        valorProduto3 = entrada.nextDouble();
        System.out.println("Informe o valor do produto: ");
        valorProduto4 = entrada.nextDouble();

        valorCompra = valorProduto1 + valorProduto2 + valorProduto3 + valorProduto4;

        if(valorCompra <= 100){
            System.out.println("O valor a ser pago é de " +valorCompra);
        }
         else if (valorCompra >100 && valorCompra < 200) {
             valorProduto1 = (valorProduto1 * 10) / 100;
             valorCompra = valorCompra - valorProduto1;
            System.out.println("O valor a ser pago é de " +valorCompra);
        } else if (valorCompra >= 200 && valorCompra <= 500 ) {
           double  valorProdutos = ((valorProduto1 + valorProduto2) * 15) / 100;
            valorCompra = valorCompra - valorProdutos;
            System.out.println("O valor a ser pago é de " +valorCompra);
        } else if (valorCompra > 500) {
            valorCompra = (valorCompra * 25) / 100;

        }
    }
}
