package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio41 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de hora trabalhada: ");
        double valorHora = Double.parseDouble(entrada.nextLine());

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = Double.parseDouble(entrada.nextLine());

        double salario = valorHora * horasTrabalhadas;
        double ajusteSalario = salario + (salario * 0.10);

        System.out.println("O valor a ser pago é igual a R$ " + ajusteSalario);

    }
}
