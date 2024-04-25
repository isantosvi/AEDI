package exercicio02;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1, valor2, valor3, valor4, total;
        System.out.println("Informe um valor: ");
        valor1 = entrada.nextInt();
        System.out.println("Informe um valor: ");
        valor2 = entrada.nextInt();
        System.out.println("Informe um valor: ");
        valor3 = entrada.nextInt();
        System.out.println("Informe um valor: ");
        valor4 = entrada.nextInt();

        total = valor1 + valor2 + valor3 +valor4;

        System.out.println("O valor total é de: " +total);
    }
}
