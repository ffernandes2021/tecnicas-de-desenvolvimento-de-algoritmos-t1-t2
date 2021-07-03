import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        double novoSalario;        
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o código do cargo: ");
        int codigoCargo = scanner.nextInt();

        switch (codigoCargo) {
            case 101:
                novoSalario = salario + salario * 10 / 100;
                break;
            case 102:
                novoSalario = salario + salario * 20 / 100;
                break;
            case 103:
                novoSalario = salario + salario * 30 / 100;
                break;
            default:
                novoSalario = salario + salario * 40 / 100;
                break;
        }
        
        double diferenca = novoSalario - salario;
        
        System.out.println("Salário antigo: " + salario);
        System.out.println("Novo salário: " + novoSalario);
        System.out.println("Diferença: " + diferenca);

    }

}