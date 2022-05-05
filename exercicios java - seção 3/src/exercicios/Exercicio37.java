package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio37 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double preco = Double.parseDouble(entrada.nextLine());

        double valorAjustado = preco - (preco * 0.12);

        System.out.println("O valor com desconto é igual a R$" + valorAjustado);
    }
}
