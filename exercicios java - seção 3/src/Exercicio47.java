
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio47 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor inteiro positivo de quatros digitos: ");
        int valor = Integer.parseInt(entrada.nextLine());

        String numeros = String.valueOf(valor);

        char[] digitos = numeros.toCharArray();

        System.out.println("Valores separados: ");
        for (int i = 0; i < digitos.length; i++) {
            System.out.println(digitos[i]);
        }

    }
}
