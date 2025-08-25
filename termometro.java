import java.util.Scanner;

public class termometro {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //entrada de dados
        System.out.println("Digite uma temperatura em Fahrenheit : ");
        int fahreneit = sc.nextInt();

        int celcius = (fahreneit - 32) * 5 / 9;

        sc.close();

        System.out.println("A temperatura convertida de Fahrenheit para Celcius foi: " + celcius);
    }
}
