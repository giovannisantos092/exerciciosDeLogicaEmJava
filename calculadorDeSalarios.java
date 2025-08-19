import java.util.Scanner;

public class calculadorDeSalarios {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

        // Solicita e lê o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo atual: R$ ");
        double salarioMinimo = input.nextDouble();

        // Solicita e lê o valor do salário do usuário
        System.out.print("Digite o seu salário: R$ ");
        double salarioUsuario = input.nextDouble();

        // Verifica se o salário mínimo é maior que zero para evitar divisão por zero
        if (salarioMinimo > 0) {
            // Calcula a quantidade de salários mínimos
            double quantidadeSalarios = salarioUsuario / salarioMinimo;

            // Exibe o resultado formatado para duas casas decimais
            System.out.printf("O usuário ganha %.2f salários mínimos.", quantidadeSalarios);
        } else {
            System.out.println("O valor do salário mínimo deve ser maior que zero.");
        }

        // Fecha o Scanner
        input.close();
    }
}