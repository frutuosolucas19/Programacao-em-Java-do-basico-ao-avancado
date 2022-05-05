
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio27 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor de area em hectares: ");
        double area = Double.parseDouble(entrada.nextLine());

        double conversao = area * 10000;

        System.out.println(area + " hectares é igual a " + conversao + " m²");
    }

}
