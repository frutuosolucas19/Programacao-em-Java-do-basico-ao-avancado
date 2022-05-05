package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio30 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor em real: ");
        double real = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o valor da cotação do dólar: ");
        double cotacao = Double.parseDouble(entrada.nextLine());

        double dolar = cotacao * real;
        System.out.println(real + " reais é igual a " + dolar +" doláres");
    }
}
