import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        while (anoAtual <= anoNascimento) {
            System.out.print("O ano atual não pode ser inferior ou igual ao ano de nascimento! Tente novamente: ");
            anoAtual = scanner.nextInt();
        }
        int idadeAno = anoAtual - anoNascimento;
        System.out.println("Idade em anos: " + idadeAno);
        System.out.println("Idade em meses: " + idadeAno * 12);
        System.out.println("Idade em dias: " + idadeAno * 365);      
        
    }
    
}