public class Exercicio9 {
    
    public static void main(String[] args) {
        
        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        int i = 0;
        
        while (alturaFelisberto <= alturaAnacleto) {
            i++;
            alturaAnacleto = alturaAnacleto + 0.02;
            alturaFelisberto = alturaFelisberto + 0.03;            
        }
        
        System.out.print("Quantidade de anos: " + i);
    }
}