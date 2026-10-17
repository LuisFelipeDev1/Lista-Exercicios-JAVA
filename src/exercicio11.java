import java.util.Scanner;
public class exercicio11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira nota1: ");
        double a = sc.nextDouble();
        System.out.println("Insira nota2: ");
        double b = sc.nextDouble();
        System.out.println("Insira nota3: ");
        double c = sc.nextDouble();
        double media = (a + b + c) / 3;
        System.out.printf("A média é: %.2f\n", media);
        if (media>=7){
            System.out.println("Aprovado!!!!!!");
        }else {
            System.out.println("Reprovado :(");
        }
        sc.close();
    }
}