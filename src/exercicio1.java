 import java.util.Scanner;

public class exercicio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A ");
        int A = sc.nextInt();
        System.out.println("Insira o valor de B ");
        int B = sc.nextInt();
        System.out.println("Insira o valor de C ");
        int C = sc.nextInt();
        sc.close();
        int soma = A + B  ;
        if (soma < C ){
            System.out.println("A soma é menor que C ");
        }else{
            System.out.println("A soma é: " + soma);
        }
    }
}
