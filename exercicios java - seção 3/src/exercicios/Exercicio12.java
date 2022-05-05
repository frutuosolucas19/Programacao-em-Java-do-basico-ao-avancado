package exercicios;


import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a distancia em milhas: ");
        double distancia = Double.parseDouble(entrada.nextLine());
        
        double conversao = 1.61 * distancia;
        
        System.out.println(distancia+" milhas é igual a "+conversao+" km");
    }
}
