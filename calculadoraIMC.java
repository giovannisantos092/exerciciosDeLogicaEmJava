

import java.util.Locale;
import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);;

        //Declaração das variaveis
        double peso,imc;
        double altura;

        //entrada de dados
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        //formula do imc
        imc = peso / (altura * altura);


        //condicionais
        if(imc < 18.5){
            System.out.println("Voce esta abaixo do peso!");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Voce esta no peso ideal!");
        }else if (imc >= 25 && imc <=29.9){
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau 1");
        }else if(imc >= 35 && imc <=39.9){
            System.out.println("Obesidade grau 2");
        }else{
            System.out.println("Obesidade morbida");
        }
        System.out.println("Seu IMC é: " + String.format("%.2f", imc));

        // Fechando o Scanner para liberar recursos
        sc.close();
        }

}
