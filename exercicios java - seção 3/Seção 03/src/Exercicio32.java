
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio32 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = Integer.parseInt(entrada.nextLine());

        int sucessor = (int) (Math.pow(numero,3))+1;
        int antecessor = (int) (Math.pow(numero,2))-1;
        int soma = sucessor+antecessor;

        System.out.println("Sucessor:  " + sucessor);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Soma: " + soma);
    }
}
