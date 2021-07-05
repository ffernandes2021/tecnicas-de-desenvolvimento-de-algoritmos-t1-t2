import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o valor 1: ");
        double v1 = scanner.nextDouble();
        System.out.print("Digite o valor 2: ");
        double v2 = scanner.nextDouble();
        realizarOperacoesAritmeticas(v1, v2);
    }
    
    public static void realizarOperacoesAritmeticas(double valor1, double valor2) {
        
        System.out.println("Adição: " + (valor1 + valor2));
        System.out.println("Subtração: " + (valor1 - valor2));
        System.out.println("Multiplicação: " + (valor1 * valor2));
        System.out.println("Divisão: " + (valor1 / valor2));

    }

}