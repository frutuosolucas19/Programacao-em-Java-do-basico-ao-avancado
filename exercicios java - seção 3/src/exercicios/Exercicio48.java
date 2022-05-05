package exercicios;


import java.time.Duration;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio48 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Conversor de segundos: ");
        int qtdSegundos = Integer.parseInt(entrada.nextLine());

        Duration total = Duration.ofSeconds(qtdSegundos);
        int horas = total.toHoursPart();
        int minutos = total.toMinutesPart();
        int segundos = total.toSecondsPart();
        
        System.out.println(horas+" horas "+minutos+ " minutos e "+segundos+" segundos");

    }
}
