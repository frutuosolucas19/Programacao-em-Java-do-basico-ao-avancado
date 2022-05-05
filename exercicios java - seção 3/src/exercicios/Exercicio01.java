package exercicios;


import java.util.Scanner;

/**
 *
 * @author lucas
 * 
 * 
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int numero = Integer.parseInt(entrada.nextLine());

        System.out.println("O número inteiro informado foi: " + numero);
    }

}
