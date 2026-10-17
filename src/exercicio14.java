import java.util.Scanner;

public class exercicio14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira A ");
        int a = sc.nextInt();
        System.out.println("Insira B ");
        int b = sc.nextInt();
        int valor = a;
        a= b;
        b= valor;
        System.out.println("o Valor de A trocado pelo valor de B: "+ a);
        System.out.println("o Valor de B trocado pelo valor de A: "+ valor);


    }
}
