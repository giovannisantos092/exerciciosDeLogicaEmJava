import java.util.Scanner;

public class AnoDeNascimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento");
        int anoDeNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int ano = anoAtual - anoDeNascimento;
        int meses = ano *12;
        int dias = ano * 365;

        sc.close();

        System.out.println(" Sua idade atual é: " + ano + " anos de idade");
        System.out.println(" Com " + meses + " meses ");
        System.out.println(" E " + dias + " dias " );
    }
}
