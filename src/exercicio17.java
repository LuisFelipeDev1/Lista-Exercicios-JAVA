import java.util.Scanner;

public class exercicio17 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em ºF");
        double far = sc.nextDouble();
        double celsius = ((far - 32)* 100)/ 180;
        System.out.println("A temperatura em Celsius: " +celsius + " ºC");
        System.out.println("A temperatura em Fahrenheit: " +far+ " ºF");
    }
}
