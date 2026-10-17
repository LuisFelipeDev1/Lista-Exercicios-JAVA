import java.util.Scanner;

public class exercicio5 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu salário ");

        double salario = sc.nextDouble();
        double salarMin = 1293.20;
        double salar = salario/salarMin;

        System.out.println("O numero de salários é " + salar);


    }
}
