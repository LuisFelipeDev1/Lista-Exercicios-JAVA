import java.util.Scanner;

public class exercicio22 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira A:\n");
        double A = sc.nextDouble();
        System.out.print("Insira B:\n");
        double B = sc.nextDouble();

        double divis = A / B;
        double rest = A % B;

        System.out.printf("O quociente %.2f\n", divis);
        System.out.printf("O resto %.2f\n", rest);
        sc.close();
    }
}