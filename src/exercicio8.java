import java.util.Scanner;
import java.util.Arrays;
public class exercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira " );
        int a = sc.nextInt();
        System.out.println("Insira " );
        int b = sc.nextInt();
        System.out.println("Insira " );
        int c = sc.nextInt();
        int[] valores = {a, b, c};
        Arrays.sort(valores); // ordena de forma crescente
        System.out.println("valores em ordem decrescente: ");
        for (int i = valores.length - 1; i >= 0 ; i--) {
            System.out.println(valores[i]);
        }

    }
}
