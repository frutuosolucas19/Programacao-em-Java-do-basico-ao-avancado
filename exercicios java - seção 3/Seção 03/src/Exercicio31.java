
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio31 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = Integer.parseInt(entrada.nextLine());

        int sucessor = numero+1;
        int antecessor = numero-1;

        System.out.println("Sucessor:  " + sucessor);
        System.out.println("Antecessor: " + antecessor);
    }
}
