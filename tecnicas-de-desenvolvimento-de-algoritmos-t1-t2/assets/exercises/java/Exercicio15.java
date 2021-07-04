import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        double menor = 0;
        double medio = 0;
        double maior = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o valor de i (1 | 2 | 3): ");
        int i = scanner.nextInt();
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();
        if ((a > b) && (a > c)) {
            if (b > c) {
                maior = a;
                medio = b;
                menor = c;
            } else {
                maior = a;
                medio = c;
                menor = b;
            }
        } else {
            if ((b > a) && (b > c)) {
                if (a > c) {
                    maior = b;
                    medio = a;
                    menor = c;
                } else {
                    maior = b;
                    medio = c;
                    menor = a;
                }
            } else {
                if ((c > a) && (c > b)) {
                    if (a > b) {
                        maior = c;
                        medio = a;
                        menor = b;
                    } else {
                        maior = c;
                        medio = b;
                        menor = a;
                    }
                }
            }
        }
        switch (i) {
            case 1:
                System.out.print("Os números em ordem crescente: " + menor + ", " + medio + ", " + maior);
                break;
            case 2:
                System.out.print("Os números em ordem decrescente: " + maior + ", " + medio + ", " + menor);
                break;
            case 3:
                System.out.print("O maior entre os outros dois: " + menor + ", " + maior + ", " + medio + " ou " + medio + ", " + maior + ", " + menor);
                break;
        }

    }

}