package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio28 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int numero1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o segundo valor: ");
        int numero2 = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o terceiro valor: ");
        int numero3 = Integer.parseInt(entrada.nextLine());

        int soma = (int) ((Math.pow(numero1, 2)) + (Math.pow(numero2, 2)) + (Math.pow(numero3, 2)));
        System.out.println("A soma do quadrado dos valores é igual a: " + soma);
    }

}
