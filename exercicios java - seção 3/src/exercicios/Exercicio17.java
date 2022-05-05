package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor de comprimento em centimetros: ");
        double comprimento = Double.parseDouble(entrada.nextLine());

        double conversao = comprimento / 2.54;

        System.out.println(comprimento + " centimetros é igual a " + conversao + " polegadas");

    }
}
