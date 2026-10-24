import java.util.Scanner;

public class exercicio23{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora-aula (R$): ");
        double valorHoraAula = sc.nextDouble();
        System.out.print("Digite o número de aulas lecionadas no mês: ");
        int numeroAulas = sc.nextInt();
        System.out.print("Digite o percentual de desconto do INSS em %: ");
        double percentualINSS = sc.nextDouble();

        double salarioBruto = valorHoraAula * numeroAulas;
        double valorDesconto = salarioBruto * (percentualINSS / 100);
        double salarioLiquido = salarioBruto - valorDesconto;
        System.out.printf("Salário Bruto   : R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto INSS   : R$ %.2f (%.1f%%)\n", valorDesconto, percentualINSS);
        System.out.printf("SALÁRIO LÍQUIDO : R$ %.2f\n", salarioLiquido);
        sc.close();
    }

}

