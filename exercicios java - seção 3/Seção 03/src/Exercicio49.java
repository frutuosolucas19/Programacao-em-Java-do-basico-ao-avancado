
import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Exercicio49 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Preencha os campos abaixo com o horário atual");
        System.out.println("Hora: ");
        int hora = Integer.parseInt(entrada.nextLine());
       
        System.out.println("Minuto: ");
        int minuto = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Segundo: ");
        int segundo = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Duração evento (segundos): ");
        int duracao = Integer.parseInt(entrada.nextLine());
        
        int horas = duracao/3600;
        int minutos = (duracao-(horas*3600))/60;
        int segundos = duracao - (horas*3600)-(minutos*60);
        
        int horaFinal = hora+horas;
        int minutoFinal = minuto+minutos;
        int segundoFinal = segundo+segundos;
        
        System.out.println("A experiencia terminara as "+ horaFinal+":"+ minutoFinal+":"+ segundoFinal);
    }
}
