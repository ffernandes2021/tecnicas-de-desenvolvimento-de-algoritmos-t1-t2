import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        System.out.print(testar(a, b));
        
    }   
    
    public static int testar(int valorA, int valorB) {
        
        if (valorA == 0) {
            if (valorB == 0) {
                System.out.print("A = B");                
            } else {
                System.out.print("A < B");
            }
        } else {
            if (valorB == 0) {
                System.out.print("A > B");
            } else {
                valorA--;
                valorB--;
                return testar(valorA, valorB);
            }
        } 
        return 0;
    
    }

}