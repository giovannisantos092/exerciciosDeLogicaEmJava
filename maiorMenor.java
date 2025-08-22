import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c;

        //Entrada de Dados
        System.out.println("Digite um numero: ");
        a = sc.nextInt();

        System.out.println("Digite um numero:");
        b = sc.nextInt();

        System.out.println("Digite o ultimo numero: ");
        c = sc.nextInt();

        sc.close();

       //variaveis para guardar ordem crescente
       int maior, meio, menor;

       if (a >= b && a >= c){
           maior = a;
           if(b >=c){
               meio = b;
               menor = c;
           }else{
               meio = c;
               menor = b;
           }
       }else if (b >= a && b >= c){
           maior = b;
           if(a >=c){
               meio = a;
               menor =c;
           }else{
               meio =c;
               menor = a;
           }
       }else{ //c e o maior
           maior =c;
           if(a >= b){
               meio = a;
               menor = b;
           }else{
               meio = b;
               menor = a;
           }
       }
        System.out.println("Valores em ordem crescente: ");
        System.out.println(maior);
        System.out.println(meio );
        System.out.println(menor);
    }
}
