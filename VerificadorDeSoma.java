import java.util.Scanner;

public class VerificadorDeSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a, b, c;

        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = scanner.nextInt();

        int soma = A + B;

        System.out.println("A soma de A e B é: "+ soma);

        if (soma < C){
            System.out.println("A soma é menor que C");
        }else{
            System.out.println("A soma não é maior que C");
        }
        scanner.close();

    }
}
