package exercicios;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio45 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Conversor de letra maiúscula para minúscula");
        System.out.println("Digite uma letra em Maiúsculo: ");
        String letra = entrada.nextLine().toLowerCase().trim();
        
        System.out.println("Letra convertida: "+letra);

       
    }
}
