import java.util.Scanner;

public class VerificadorDenumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero " + numero +" é par!");
        }else{
            System.out.println("O numero " + numero + " é impar!");
        }
        if(numero > 0){
            System.out.println("O numero " + numero + " é positivo!");
        }else if (numero < 0){
            System.out.println("O numero " + numero + " é negativo!");
        }else{
            System.out.println(" é neutro (zero)");
        }
        scanner.close();
    }
}
