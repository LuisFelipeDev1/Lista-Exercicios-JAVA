import java.util.Scanner;

public class exercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Insira o valor de A: ");
        int A = sc.nextInt();
        System.out.println( "Insira o valor de B: ");
        int B = sc.nextInt();
        if (A==B){
            int C = A+B;
            System.out.println("A soma é: "+ C);
        }else {
            int C = A * B;
            System.out.println("A multiplicação é: "+ C);
        }
    }
}
