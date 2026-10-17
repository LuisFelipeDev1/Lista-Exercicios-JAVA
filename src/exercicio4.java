import  java.util.Scanner;

public class exercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um número ");
        int num = sc.nextInt();
        int prox = num + 1;
        int ant = num - 1;
        System.out.println("o seu antecessor "+ ant+ " e o seu sucessor é "+ prox);


    }
}
