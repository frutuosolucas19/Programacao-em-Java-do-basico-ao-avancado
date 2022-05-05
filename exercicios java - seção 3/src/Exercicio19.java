
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor em litros: ");
        double volume = Double.parseDouble(entrada.nextLine());

        double conversao = volume / 1000;

        System.out.println(volume + " litros é igual a " + conversao + " m³");

    }
}
