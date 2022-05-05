package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor em metros cúbicos m³: ");
        double volume = Double.parseDouble(entrada.nextLine());

        double conversao = volume * 1000;

        System.out.println(volume + " m³ é igual a " + conversao + " litros");

    }
}
