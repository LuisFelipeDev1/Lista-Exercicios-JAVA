import java.util.Scanner;
public class exercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira True ou False" );
        boolean a = sc.nextBoolean();
        System.out.println("Insira True ou False ");
        boolean b = sc.nextBoolean();
        if ( a && b){
            System.out.println("Ambos Verdadeiros");
        }else if ( !a && !b){
            System.out.println("Ambos Falso");
        }else {
            System.out.println("Ambos Diferentes ");
        }
    }
}
