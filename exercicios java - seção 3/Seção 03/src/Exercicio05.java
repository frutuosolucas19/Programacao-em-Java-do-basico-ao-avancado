
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número real: ");
        double numero = Double.parseDouble(entrada.nextLine());

        double quintaParte = numero * 1/5;

        System.out.println("A quinta parte de " + numero + " é igual a: " + quintaParte);
    }

}
