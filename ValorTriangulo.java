import java.util.Scanner;

public class ValorTriangulo {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o valor de A do Triangulo: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B do Triangulo: ");
        int b = sc.nextInt();

        System.out.println("Digite o valor de C do triangulo: ");
        int c = sc.nextInt();

        //condicionais
        if(a == b && b == c){
            System.out.println("O triangulo É equilatero e possui todos os lados iguais");
        } else if (a == b || b == c || a == c){
            System.out.println("O triangulo é Isósceles e possui dois lados iguais ");
        }else if (a != b && b !=c && a != c){
            System.out.println("O triangulo é Escaleno e possui todos os lados diferentes");
        }
        sc.close();

    }
}
