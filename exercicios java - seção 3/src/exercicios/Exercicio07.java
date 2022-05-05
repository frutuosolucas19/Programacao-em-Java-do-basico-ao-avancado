package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");
        double temperatura = Double.parseDouble(entrada.nextLine());

        double conversao = 5.0 * (temperatura - 32.0) / 9.0;

        System.out.println("A temperatura " + temperatura + " Fahrenheit é igual a " + conversao + " Celcius");
    }
}
