import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o total de votantes: ");
        int qtdeVotantes = scanner.nextInt();

        for (int i = 1; i <= qtdeVotantes; i++) {

            System.out.print("Digite seu voto (1 | 2 | 3): ");
            int voto = scanner.nextInt();

            while ((voto != 1) && (voto != 2) && (voto != 3)) {
                System.out.print("Candidato inexistente! Tente novamente (1 | 2 | 3): ");
                voto = scanner.nextInt();
            }

            if (voto == 1) {
                c1++;
            } else {
                if (voto == 2) {
                    c2++;
                } else {
                    c3++;
                }
            }

        }

        System.out.println("Votos C1: " + c1);
        System.out.println("Votos C2: " + c2);
        System.out.println("Votos C3: " + c3);

    }
}