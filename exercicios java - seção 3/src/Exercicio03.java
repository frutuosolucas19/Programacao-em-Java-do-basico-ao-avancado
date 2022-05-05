
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int numero1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o segundo valor: ");
        int numero2 = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o terceiro valor: ");
        int numero3 = Integer.parseInt(entrada.nextLine());

        int soma = numero1 + numero2 + numero3;

        System.out.println("A soma dos valores é igual a: " + soma);
    }
}
