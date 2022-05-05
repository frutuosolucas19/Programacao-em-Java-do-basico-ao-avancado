package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio36 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro circular: ");
        double raio = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite a altura do cilindro circular: ");
        double altura = Double.parseDouble(entrada.nextLine());

        double area = (Math.pow(raio, 2) * Math.PI * altura);

        System.out.println("A àrea do cilindro circular é igual a " + area);
    }
}
