
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio46 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor inteiro positivo de três digitos: ");
        int valor = Integer.parseInt(entrada.nextLine());

        String numero = String.valueOf(valor);
        String numeroInvertido = new StringBuilder(numero).reverse().toString();

        int invertido = Integer.parseInt(numeroInvertido);
        System.out.println("Valor informado no inverso: " + invertido);
    }
}
