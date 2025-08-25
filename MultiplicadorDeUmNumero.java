import java.util.Scanner;

public class MultiplicadorDeUmNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite um valor pra a tabuada");
        int valor = sc.nextInt();

        System.out.println("Tabuada do " + valor + ":");
        //loop para calcular e imprimir a tabuada do valor digitado
        //a variavel i sera o multiplicador de 1a 10
        for (int i = 1 ; i <= 10 ; i ++){
            int resultado = valor * i;
            System.out.println(valor + " X " + i + " = " + resultado );
        }
    }
}
