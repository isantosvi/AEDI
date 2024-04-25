package exercicio02;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        System.out.println("Informe a sua nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Informe a sua nota: ");
        nota2 = entrada.nextFloat();
        System.out.println("Informe a sua nota: ");
        nota3 = entrada.nextFloat();

        media = (nota1 + nota2 +nota3)/ 3;
        System.out.printf("A sua média de notas é de %f",media);

    }
}
