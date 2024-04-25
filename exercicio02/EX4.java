package exercicio02;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salarioaumento,total;
        int taxa;

        System.out.println("Informe o seu salario atual: ");
        salario = entrada.nextDouble();
        System.out.println("Informe o valor de porcentagem de aumento do seu salário: ");
        taxa = entrada.nextInt();

        salarioaumento = (salario * taxa) / 100;
        /* (valor * taxa) / 100  */
        total = salario +salarioaumento;
        System.out.println("O salario será de " +total);
    }
}
