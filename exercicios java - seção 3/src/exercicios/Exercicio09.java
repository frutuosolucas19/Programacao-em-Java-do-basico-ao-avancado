package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celcius: ");
        double temperatura = Double.parseDouble(entrada.nextLine());

        double conversao = temperatura + 273.15;

        System.out.println("A temperatura " + temperatura + " Celcius é igual a " + conversao + " Kelvin");
    }
}
