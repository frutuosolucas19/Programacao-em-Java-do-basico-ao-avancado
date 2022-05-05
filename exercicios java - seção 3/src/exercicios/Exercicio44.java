package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio44 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a altura do degrau: ");
        double alturaDegrau = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe a altura que deseja subir: ");
        double alturaDesejada = Double.parseDouble(entrada.nextLine());

        double quantidadeDegraus = alturaDesejada / alturaDegrau;

        System.out.println("O usuário deve subir " + quantidadeDegraus + " degraus");
    }
}
