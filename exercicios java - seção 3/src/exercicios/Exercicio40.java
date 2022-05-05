package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio40 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantidade de dias trabalhados: ");
        double dias = Double.parseDouble(entrada.nextLine());

        double valorBruto = dias * 30.00;
        double valorLiquido = valorBruto - (valorBruto * 0.08);

        System.out.println("O valor a ser pago é igual a R$ " + valorLiquido);
    }
}
