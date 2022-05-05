
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor de comprimento em polegadas: ");
        double comprimento = Double.parseDouble(entrada.nextLine());

        double conversao = comprimento * 2.54;
        
        System.out.println(comprimento+" polegadas é igual a "+conversao+" centimetros");

    }
}
