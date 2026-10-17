import java.util.Scanner;

public class exercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o peso " );
        double a = sc.nextDouble();
        System.out.println("Insira o altura " );
        double b = sc.nextDouble();
        double imc = a/Math.pow(b,2);
        System.out.printf("seu IMC é: %.2f\n", imc);
        if (imc < 18.5){
            System.out.println("Abaixo do peso ");
        }else if ( imc >=18.6 && imc <=29.9){
            System.out.println("Peso ideal (parabéns)");
        }else if (imc >=25.0 && imc <=34.9){
            System.out.println("Levemente acima do peso");
        }else if (imc >=35.0 && imc <=39.9 ){
            System.out.println("Obesidade grau II");
        }else{
            System.out.println("Obesidade grau III");
        }
        sc.close();
    }
}
