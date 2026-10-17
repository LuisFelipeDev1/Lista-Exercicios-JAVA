import java.util.Scanner;

public class exercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        double num = sc.nextDouble();
        double ajust = num * 0.05;
        double C = num + ajust;
        System.out.println(C);
    }
}
