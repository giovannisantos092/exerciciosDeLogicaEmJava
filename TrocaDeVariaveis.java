import java.util.Scanner;

public class TrocaDeVariaveis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        //troca de variaveis
        int aux = a;
        a = b;
        b = aux;

        //saida de dados
        System.out.println("Novo valor de A " + a);
        System.out.println("Novo valor de B " + b);

        sc.close();
    }
}
