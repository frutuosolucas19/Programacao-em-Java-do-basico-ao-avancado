
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor de massa em libras: ");
        double valorMassa = Double.parseDouble(entrada.nextLine());

        double conversao = valorMassa * 0.45;

        System.out.println(valorMassa + " libras é igual a " + conversao + " quilogramas");
    }

}
