
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio51 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a coordenada x: ");
        double x = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe a coordenada y: ");
        double y = Double.parseDouble(entrada.nextLine());

        double resultadoAux = (Math.pow(x, 2) + Math.pow(y, 2));
        
        double resultado = Math.sqrt(resultadoAux);

        System.out.println("Distância da origem igual a " + resultado);

    }
}
