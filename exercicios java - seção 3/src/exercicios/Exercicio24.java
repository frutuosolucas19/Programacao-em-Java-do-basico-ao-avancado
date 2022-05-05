package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio24 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor de area em metros quadrados m²: ");
        double area = Double.parseDouble(entrada.nextLine());

        double conversao = area * 0.000247;

        System.out.println(area + " m² é igual a " + conversao + " acres");
    }

}
