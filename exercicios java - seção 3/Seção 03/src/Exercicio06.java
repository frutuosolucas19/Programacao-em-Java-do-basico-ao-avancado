
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celcius: ");
        double temperatura = Double.parseDouble(entrada.nextLine());

        double conversao = temperatura * (9.0 / 5.0) + 32;
        
        System.out.println("A temperatura "+temperatura+" Celcius é igual a "+conversao+" Fahrenheit");
    }
}
