package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio39 {

    public static void main(String[] args) {

        double valorTotal = 780000;

        double premio1 = valorTotal * 0.46;
        double premio2 = valorTotal * 0.36;
        double premio3 = valorTotal - (premio1 + premio2);

        System.out.println("Prêmio 1: " + premio1);
        System.out.println("Prêmio 2: " + premio2);
        System.out.println("Prêmio 3: " + premio3);
    }
}
