import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite seu nome: ");
        String  nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println(nome + " Voce nao tem a maior idade ");
        }else{
            System.out.println(nome+ " Voce tem a maior idade ");
        }


    }
}
