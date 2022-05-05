
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um angulo em radianos: ");
        double angulo = Double.parseDouble(entrada.nextLine());

        double conversao = angulo * 180 / Math.PI;

        System.out.println(angulo + " radianos é igual a " + conversao + " graus");
    }

}
