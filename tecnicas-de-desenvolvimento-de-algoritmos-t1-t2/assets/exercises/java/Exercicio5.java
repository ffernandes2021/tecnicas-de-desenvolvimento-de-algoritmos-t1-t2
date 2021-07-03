import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            if (numero % 2 == 0) {
                System.out.print("positivo e par");
            } else {
                System.out.print("positivo e ímpar");
            }
        } else {
            if (numero % 2 == 0) {
                System.out.print("negativo e par");
            } else {
                System.out.print("negativo e ímpar");
            }
        }
    }

}