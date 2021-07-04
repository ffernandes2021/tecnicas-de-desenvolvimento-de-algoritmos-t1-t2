import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out. print("Digite a quantidade de latas (350ml): ");
        int quantidadeF1 = scanner.nextInt();
        System.out.print("Digite a quantidade de garrafas (600ml): ");
        int quantidadeF2 = scanner.nextInt();
        System.out.print("Digite a quantidade de garrafas (2l): ");
        int quantidadeF3 = scanner.nextInt();
        System.out.print("Quantidade em litros: " + (quantidadeF1 * 0.350 + quantidadeF2 * 0.600 + quantidadeF3 * 2));

    }
    
}