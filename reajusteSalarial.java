import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class reajusteSalarial {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu salario mensal: ");

        double salarioMensal = sc.nextDouble();

        double valorReajuste = salarioMensal * 0.05;

        double salarioComReajuste = salarioMensal * 0.05;


        System.out.println("Seu salario mensal com reajuste");
        System.out.println(salarioComReajuste);


    }


}
