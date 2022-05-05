
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio25 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor de area em acres: ");
        double area = Double.parseDouble(entrada.nextLine());

        double conversao = area * 4048.58;

        System.out.println(area + " acres é igual a " + conversao + " m²");
    }

}
