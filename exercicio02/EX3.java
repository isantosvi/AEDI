package exercicio02;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salarioaumento, total;
        System.out.println("Informe o seu salario atual: ");
        salario = entrada.nextDouble();

        salarioaumento = (salario * 25) / 100;
        /* (valor * taxa) / 100  */
        total = salario +salarioaumento;
        System.out.println("O salario será de " +total);
    }
}
