
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio53 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o comprimento do terreno: ");
        double c = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe a largura do terreno: ");
        double l = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe o preço do metro de tela: ");
        double p = Double.parseDouble(entrada.nextLine());

        double custo = c * l * p;

        System.out.println("Custo para cercar o terreno R$: " + custo);

    }
}
