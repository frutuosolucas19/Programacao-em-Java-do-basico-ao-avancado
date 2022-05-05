package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a velocidade em km/h: ");
        double velocidade = Double.parseDouble(entrada.nextLine());

        double conversao = velocidade / 3.6;

        System.out.println(velocidade + " km/h é igual a " + conversao + " m/s");
    }

}
