import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade em anos: ");
        int ano = scanner.nextInt();
        System.out.print("Digite a idade em meses: ");
        int mes = scanner.nextInt();
        System.out.print("Digite a idade em dias: ");
        int dia = scanner.nextInt();
        System.out.print("Idade em dias: " + (ano * 365 + mes * 30 + dia));

    }

}