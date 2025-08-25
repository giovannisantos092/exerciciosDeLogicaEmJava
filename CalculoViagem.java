import java.util.Scanner;

public class CalculoViagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o tempo gasto na viagem (em horas) : ");
        int horasDeViagem = sc.nextInt();

        System.out.println("Digite a Velocidade media do veiculo : ");
        double velocidadeMedia = sc.nextDouble();

        //processamentos de dados
        double distancia = horasDeViagem * velocidadeMedia;
        double litrosUsados = distancia / 12;

        sc.close();
        System.out.printf("A distância percorrida foi: %.2f km\n", distancia);
        System.out.printf("A quantidade de litros usados na viagem foi: %.2f litros\n", litrosUsados);

    }
}
