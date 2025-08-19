import java.util.Scanner;

public class SomatoriosIguais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b =0;
        int soma;


        System.out.println("Digite um numero: ");
        a = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        b = scanner.nextInt();

        soma = a + b;

        if (a == b){
            System.out.println(soma);
        }else {
            System.out.println("O resultado foi: " + (a + b) );
        }
        scanner.close();

    }
}
