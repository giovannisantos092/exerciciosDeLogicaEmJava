import java.util.Scanner;

public class SomatoriosIguais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b =0;
        int c = 0;
        int soma;
        int multiplicador;


        System.out.println("Digite um numero: ");
        a = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        b = scanner.nextInt();

        soma = a + b;
        multiplicador = a * b;
        c = multiplicador;

        if (a == b){
            System.out.println(soma);
        }else if(a != b){
            System.out.println(multiplicador);
        } else{
            System.out.println(" O valor de c é : " + c);
        }
        scanner.close();

    }
}
