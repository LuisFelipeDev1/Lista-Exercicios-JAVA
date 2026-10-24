import java.util.Scanner;
public class exercicio20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira de qual número deseja a tabuada: ");
        int num = sc.nextInt();

        for (int i = 0; i <=10 ; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
