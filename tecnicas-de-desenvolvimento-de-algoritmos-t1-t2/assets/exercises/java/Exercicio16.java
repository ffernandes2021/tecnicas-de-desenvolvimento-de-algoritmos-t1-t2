import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pães: ");
        int quantidadePao = scanner.nextInt();
        
        System.out.print("Digite a quantidade de broas: ");
        int quantidadeBroa = scanner.nextInt();
        
        double total = quantidadePao * 0.12 + quantidadeBroa * 1.50;
        double totalPoupanca = total * 10 / 100;
        
        System.out.println("Valor arrecadado: R$ " + total);
        System.out.println("Valor para poupança: R$ " + totalPoupanca);
    }

}