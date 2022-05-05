package exercicios;


import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um angulo em graus: ");
        double angulo = Double.parseDouble(entrada.nextLine());
        
        double conversao = angulo * Math.PI / 180;

        System.out.println(angulo + " graus é igual a " + conversao + " radianos");
    }
    
}
