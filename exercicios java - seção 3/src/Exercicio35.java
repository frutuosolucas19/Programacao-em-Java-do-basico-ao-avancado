
import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Exercicio35 {
    
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do cateto A: ");
        double catetoA = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Digite o valor do cateto B: ");
        double catetoB = Double.parseDouble(entrada.nextLine());

        double hipotenusa = Math.sqrt ((Math.pow(catetoA, 2)) + (Math.pow(catetoB, 2)));

        System.out.println("A hipotenusa é igual a " + hipotenusa);
    }
    
}
