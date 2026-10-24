import java.util.Scanner;
public class exercicio24 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem em horas: ");
        double tempo = sc.nextDouble();
        double velocidade = sc.nextDouble();
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12.0;



        System.out.printf("Velocidade Média : %.2f km/h\n", velocidade);
        System.out.printf("Tempo de Viagem  : %.2f horas\n", tempo);
        System.out.printf("Distância Total  : %.2f km\n", distancia);
        System.out.println("------------------------");
        System.out.printf("Combustível Gasto: %.2f litros\n", litrosUsados);

        sc.close();
    }
}
