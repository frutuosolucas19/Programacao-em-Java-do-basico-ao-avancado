
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio29 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double numero1 = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe a segunda nota: ");
        double numero2 = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe a terceira nota: ");
        double numero3 = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe a quarta nota: ");
        double numero4 = Double.parseDouble(entrada.nextLine());

        double media = (numero1 + numero2 + numero3 + numero4) / 4;

        System.out.println("A média das notas é igual a " + media);
    }

}
