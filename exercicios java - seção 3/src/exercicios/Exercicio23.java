package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor em metros: ");
        double distancia = Double.parseDouble(entrada.nextLine());

        double conversao = distancia / 0.91;

        System.out.println(distancia + " metros é igual a " + conversao + " jardas");
    }

}
