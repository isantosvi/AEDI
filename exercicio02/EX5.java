package exercicio02;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salariodesconto, salarioliquido, salariogratificacao;
        System.out.println("Informe o valor do seu salário: ");
        salario = entrada.nextDouble();

        salariodesconto = (salario * 7) / 100;
        salariogratificacao = ((salario * 5) / 100);
        salarioliquido = (salario - salariodesconto) + salariogratificacao;

        System.out.println(" Salario liquido: "+salarioliquido);
    }
}
