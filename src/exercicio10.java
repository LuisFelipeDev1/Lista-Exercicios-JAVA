import java.util.Scanner;
public class exercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira " );
        double a = sc.nextDouble();
        System.out.println("Insira " );
        double b = sc.nextDouble();
        System.out.println("Insira " );
        double c = sc.nextDouble();
        double media = (a + b + c) / 3;

        System.out.printf ("A média é: %.2f\n", media);
        sc.close();
    }
}
