package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio38 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = Double.parseDouble(entrada.nextLine());

        double salarioAjustado = salario + (salario * 0.25);

        System.out.println("O valor do novo salário é igual a R$ " + salarioAjustado);
    }
}
