import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volumetotal = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.printf("Digite o volume do dia %d: ", i);
            double volume = sc.nextDouble();
            volumetotal += volume;


        }
        sc.close();

        System.out.println("Volume total " +volumetotal);
    }
}
