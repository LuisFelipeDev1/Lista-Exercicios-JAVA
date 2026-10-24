import java.util.Scanner;

public class exercicio18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  alturaF = 1.50;
        double  alturaS = 1.10;
        int contador = 0;

        while (alturaF > alturaS){
            contador += 1;
            alturaF +=0.02;
            alturaS +=0.03;
            System.out.printf("Ano %2d -> Francisco: %.2fm | Sara: %.2fm\n", contador, alturaF, alturaS);
        }
        sc.close();
    }

}
