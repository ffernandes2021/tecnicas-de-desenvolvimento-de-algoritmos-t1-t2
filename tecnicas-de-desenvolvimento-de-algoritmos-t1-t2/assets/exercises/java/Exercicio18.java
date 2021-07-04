import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        double peso;
        int posicao = 0;
        double vet[] = new double[150];
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);        
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o peso: ");
            peso = scanner.nextDouble();
            vet[i] = peso;
        }        
        peso = vet[0];        
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < peso) {
                peso = vet[i];
                posicao = i;
            }
        }        
        System.out.print("Na posição: " + posicao + " está o menor peso, que é " + peso);

    }

}