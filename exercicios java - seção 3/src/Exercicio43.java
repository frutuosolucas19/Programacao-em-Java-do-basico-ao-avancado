
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio43 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        double valor = Double.parseDouble(entrada.nextLine());
        
        double totalPagar = valor - (valor*0.10);
        double tresParcelas = valor/3;
        double comissaoAvista = totalPagar * 0.05;
        double comissaoParcelado = valor * 0.05;

        System.out.println("Valor a vista: R$ "+totalPagar);
        System.out.println("Valor parcelado em 3 vezes: R$ "+tresParcelas);
        System.out.println("Comissão do vendedor, venda a vista: R$ "+comissaoAvista);
        System.out.println("Comissão do vendedor, venda parcelada: R$ "+comissaoParcelado);
    }
}
