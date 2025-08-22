import java.sql.SQLOutput;
import java.util.Scanner;

public class verdadeiroFalso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite os dados para verificação (true ou false:) ");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite outro dados para verificação: ");
        boolean valor2 = sc.nextBoolean();

        sc.close();

        //processamento logico e saida
        System.out.println("------ Resultado ------");

        //verificação se ambos sao VERDADEIROS
        if (valor1 && valor2){
            System.out.println("Ambos sao verdadeiros!");
        }
        else if(!valor1 && !valor2){
            System.out.println("Ambos sao FALSOS");
        }
        else{
            System.out.println("OS valores são diferentes. Um é VERDADEIROS  e o outro e FALSO");
        }
    }
}
