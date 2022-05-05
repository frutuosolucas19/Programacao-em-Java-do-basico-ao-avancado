package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio33 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a medida do lado do quadrado: ");
        double lado = Double.parseDouble(entrada.nextLine());

        double area = Math.pow(lado, 2);

        System.out.println("A àrea é igual a " + area);     

    }

}
