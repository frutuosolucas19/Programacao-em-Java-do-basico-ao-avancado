
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio42 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salário base do funcionário: ");
        double salarioBase = Double.parseDouble(entrada.nextLine());
        
        double ajuste = salarioBase + (salarioBase*0.05)-(salarioBase*0.07);

        System.out.println("O salário a receber é igual a R$ " + ajuste);

    }
}
