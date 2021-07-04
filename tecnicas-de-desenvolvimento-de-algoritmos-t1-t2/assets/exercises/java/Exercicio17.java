import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        scanner.useLocale(Locale.US);
        System.out.print("Digite o salário: ");
        double salarioInicial = scanner.nextDouble();
        double salarioAumento = salarioInicial + salarioInicial * 0.15;
        double salarioFinal = salarioAumento - salarioAumento * 0.08;
        System.out.println("Salário inicial: " + salarioInicial);
        System.out.println("Salário com aumento: " + salarioAumento);
        System.out.println("Salário final: " + salarioFinal);
        
    }

}