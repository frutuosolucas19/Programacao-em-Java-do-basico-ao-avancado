package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a distancia em km: ");
        double distancia = Double.parseDouble(entrada.nextLine());

        double conversao = distancia / 1.61;

        System.out.println(distancia + " km é igual a " + conversao + " milhas");
    }
}
