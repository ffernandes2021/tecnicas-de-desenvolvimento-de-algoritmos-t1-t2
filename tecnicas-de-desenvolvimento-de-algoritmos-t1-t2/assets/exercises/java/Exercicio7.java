import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = scanner.nextDouble();
        double tempCelsius = (5 * (tempFahrenheit - 32) / 9);
        System.out.printf(Locale.US, "%.2fº F %n", tempFahrenheit);
        System.out.printf(Locale.US, "%.2fº C %n", tempCelsius);
    }

}