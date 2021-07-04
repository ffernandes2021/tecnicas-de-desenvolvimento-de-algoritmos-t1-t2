import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o sexo (m | f): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite a altura: ");
        double h = scanner.nextDouble();
        if ((sexo == 'm') || (sexo == 'M')) {
            System.out.print("Peso ideal: " + (72.7 * h - 58));
        } else {
            if((sexo == 'f') || (sexo == 'F')){
                System.out.print("Peso ideal: " + (62.1 * h - 44.7));
            }
        }

    }

}