package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio22 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor em jardas: ");
        double distancia = Double.parseDouble(entrada.nextLine());

        double conversao = distancia * 0.91;

        System.out.println(distancia + " jardas é igual a " + conversao + " metros");
    }

}
