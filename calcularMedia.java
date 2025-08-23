import java.util.Scanner;

public class calcularMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //Entrada de dados
        System.out.println("Digite uma nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = sc.nextInt();

        System.out.println("Digite a quarta nota: ");
        int nota4 = sc.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 3;
        sc.close();

        if(media <= 7){
            System.out.println("Voce esta reprovado");
        }else{
            System.out.println("PARABENS!! voce está aprovado");
        }
        System.out.println("A media das tres nota é: " + media);
    }

}
