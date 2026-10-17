import java.util.Scanner;
public class exercicio12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto (R$): ");
        double valor = sc.nextDouble();

        System.out.println("---------Formas de pagamento--------- " );
        System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println(" 2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println(" 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println(" 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.println("Escolha a forma de pagamento: ");
        int op = sc.nextInt();
        if (op == 1){
            double valorN = (valor * 15)/100;
            double total = valor -valorN;
            System.out.println("O valor a ser pago é: "+ total);
            } else if (op == 2) {
            double valorN = (valor * 10)/100;
            double total = valor -valorN;
            System.out.println("O valor a ser pago é: "+ total);
        } else if (op == 3) {
            System.out.println("O valor a ser pago em 2x é: "+ valor);
        }else if (op == 4){
            double valorN = (valor * 10)/100;
            double total = valor + valorN;
            System.out.println("O valor a ser pago em 3x ou mais é: "+ total);
        }else {
            System.out.println("Escolha uma opção válida");
        }
        sc.close();
    }
}
