import java.util.Scanner;

public class exercicio15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a dia atual");
        int data = sc.nextInt();
        System.out.print("Digite o mês atual (1-12): ");
        int mesAt = sc.nextInt();
        System.out.println("Digite o ano atual");
        int anoAt = sc.nextInt();

        System.out.println("Digite a dia nascimento");
        int diaNas = sc.nextInt();
        System.out.println("Digite em que ano nasceu ");
        int ano = sc.nextInt();
        System.out.println("Digite em que mês nasceu ");
        int mes = sc.nextInt();

        int anoT = anoAt - ano;
        int diasT = data - diaNas;
        int mesT = mesAt - mes;

        // Se o dia atual for menor que o dia de nascimento, pede emprestado 30 dias do mês e subtrai -1 mês
         if (diasT < 0){
             diasT += 30;
             mesT -= 1;
         }
        // Se mes atual for menor que o dia de nascimento, pede emprestado 30 dias do mês e subtrai -1 mês
         if (mesT<0){
             mesT += 12;
             anoT -= 1;
         }
        System.out.println("\nEssa pessoa já viveu:");
        System.out.println(anoT + " anos, " + mesT + " meses e " + diasT + " dias.");
        sc.close();
    }



}
