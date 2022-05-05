package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a velocidade em m/s: ");
        double velocidade = Double.parseDouble(entrada.nextLine());

        double conversao = velocidade * 3.6;

        System.out.println(velocidade + " m/s é igual a " + conversao + " km/h");
    }

}
