import java.util.Scanner;

public class QuocienteERestoDaDivisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite um numero (A - Dividedo): ");
        int a = sc.nextInt();

        System.out.println("Digite outro valor (B- Divisor: ");
        int b = sc.nextInt();

        //verifica se o divisor e 0 para evitar um erro de divisao por zero
       if (b == 0){
           System.out.println("Erro de divisao");
       }else{
           //calcula o quociente da divisao inteira usando o operador
           int quociente = a /b;

           int resto = a % b;

           System.out.println("O quociente da divisao e: " + quociente);
           System.out.println("O resto da divisao e : " + resto);
       }
       sc.close();
    }

}
