package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio52 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do premio: ");
        double valorPremio = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe o valor investido apostador 1: ");
        double valorInvestido1 = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe o valor investido apostador 2: ");
        double valorInvestido2 = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe o valor investido apostador 3: ");
        double valorInvestido3 = Double.parseDouble(entrada.nextLine());

        double total = valorInvestido1 + valorInvestido2 + valorInvestido3;

        double premioApostador1 = (valorInvestido1 / total) * valorPremio;
        double premioApostador2 = (valorInvestido2 / total) * valorPremio;
        double premioApostador3 = (valorInvestido3 / total) * valorPremio;

        System.out.println("Premio apostador 1: R$: " + premioApostador1);
        System.out.println("Premio apostador 2: R$: " + premioApostador2);
        System.out.println("Premio apostador 3: R$: " + premioApostador3);

    }
}
