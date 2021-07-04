import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        String categoria;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        if ((idade >= 5) && (idade <= 7)) {
            categoria = "infantil A";
        } else {
            if ((idade >= 8) && (idade <= 10)) {
                categoria = "infantil B";
            } else {
                if ((idade >= 11) && (idade <= 13)) {
                    categoria = "juvenil A";
                } else {
                    if ((idade >= 14) && (idade <= 17)) {
                        categoria = "juvenil B";
                    } else {
                        if((idade >= 18)){
                            categoria = "adulto";
                        } else {
                            categoria = "não definida";
                        }
                    }
                }
            }
        }
        System.out.print("Categoria: " + categoria);

    }

}