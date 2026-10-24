import java.util.Scanner;

public class exercicio16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base");
        int base = sc.nextInt();
        System.out.println("Digite o valor da altura");
        int altura = sc.nextInt();
        System.out.println("Digite o valor da hipotenusa");
        int hipo = sc.nextInt();

        if (base==altura & altura==hipo){
            System.out.println("O triângulo é Equilátero");
        } else if (base==altura || base==hipo|| altura== hipo){
            System.out.println("O triângulo é Isósceles");
        }else {
            System.out.println("O triângulo é Escaleno");
        }
        sc.close();
    }
}
