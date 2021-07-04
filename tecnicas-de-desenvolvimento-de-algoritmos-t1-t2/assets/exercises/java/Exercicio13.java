import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        double precoUnidade = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codigoProduto = scanner.nextInt();
        while ((codigoProduto != 1001) && (codigoProduto != 1324) && (codigoProduto != 6548) && (codigoProduto != 987) && (codigoProduto != 7623)) {
            System.out.print("Código inválido! Tente novamente (1001 | 1324 | 6548 | 0987 | 7623): ");
        }
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        switch (codigoProduto) {
            case 1001:
            case 987:
                precoUnidade = 5.32;
                break;
            case 1324:
            case 7623:
                precoUnidade = 6.45;
                break;
            case 6548:
                precoUnidade = 2.37;
                break;
        }
        double precoTotal = quantidade * precoUnidade; 
        System.out.print("Preço total: " + precoTotal);
        
    }

}