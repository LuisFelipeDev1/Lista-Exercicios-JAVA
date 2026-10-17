import java.util.Scanner;


public class exercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero: ");
        int num= sc.nextInt();
        if (num % 2 == 0 ){
            System.out.println("O número "+ num + " é PAR ");
        }else {
            System.out.println("O número "+ num + " é IMPAR" );
        }

    }
}
