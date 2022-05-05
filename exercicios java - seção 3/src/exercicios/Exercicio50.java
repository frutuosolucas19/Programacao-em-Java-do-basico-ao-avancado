package exercicios;


import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio50 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        LocalDate data_atual = LocalDate.now();
        int ano_atual = data_atual.getYear();

        int ano_nascimento = ano_atual - idade;

        System.out.println("Você nasceu em " + ano_nascimento);

    }
}
