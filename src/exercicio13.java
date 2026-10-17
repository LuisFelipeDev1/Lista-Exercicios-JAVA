import java.util.Scanner;
public class exercicio13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome ");
        String nome = sc.next();
        System.out.println("Insira sua idade ");
        int idade = sc.nextInt();
        if (idade>=18){
            System.out.println("Você é MAIOR de de Idade "+ nome);
        }else {
            System.out.println("Você é MENOR de Idade "+ nome);
        }
        sc.close();
    }
}
