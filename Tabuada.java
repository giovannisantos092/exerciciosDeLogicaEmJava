import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        //Laço externo que controla o numero da tabuada de 1 a 10
        for (int i = valor; valor <= 10; valor ++){
            System.out.println("Tabuada do " + i + ":");


            //Laço interno que controla o multiplicador
            for (int j = 1; valor <= 10; j ++){
                int resultado = valor * j; //calculo do produto
                System.out.println( valor + " x " + j + " = " + resultado);
            }
        }

        System.out.println(" _____________________________ ");
    }
}
