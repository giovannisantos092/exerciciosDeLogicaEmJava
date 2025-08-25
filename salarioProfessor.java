import java.util.Scanner;

public class salarioProfessor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor do salário bruto: R$ ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor da hora/aula: R$ ");
        double valorHoraAula = sc.nextDouble();

        System.out.print("Digite o número de aulas dadas por mês: ");
        double numeroDeAulasMes = sc.nextDouble();

        System.out.print("Digite o percentual de desconto do INSS (%): ");
        double percentualInss = sc.nextDouble();

        sc.close();

        // Cálculo do salário líquido
        double valorDescontoInss = salarioBruto * (percentualInss / 100);
        double salarioLiquido = salarioBruto - valorDescontoInss;

        // Exibição dos resultados
        System.out.println("\nDetalhes do salário:");
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto do INSS (%.2f%%): R$ %.2f\n", percentualInss, valorDescontoInss);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
    }
}
