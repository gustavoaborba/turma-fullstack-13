import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o preço da fatia de bolo?");
        double fatia = scanner.nextDouble();

        System.out.println("Quanto Renan tem disponível?");
        double dinheiro = scanner.nextDouble();

        if (dinheiro >= fatia) {
            System.out.println("Compra aprovada! Pode saborear o doce.");
        } else {
        double falta = fatia - dinheiro;
            System.out.println("Saldo insuficiente. Faltam R$ " + falta);
        }
        scanner.close();
    }
}
