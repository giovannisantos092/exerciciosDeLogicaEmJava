import java.util.Scanner;

public class PagamentoComDesconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o valor do produto pra receber os descontos: ");
        double valorDoproduto = sc.nextDouble();

        double aVistaNoDinheiroEPix = valorDoproduto * 0.85;
        double aVistanoCartao = valorDoproduto * 0.90;
        double cartaoEm2x = valorDoproduto;
        double cartaoEm3xOuMais = valorDoproduto * 1.10;
        sc.close();
        System.out.println(aVistaNoDinheiroEPix);
        System.out.println(aVistanoCartao);
        System.out.println(cartaoEm2x);
        System.out.println(cartaoEm3xOuMais);
        System.out.println("Obrigado pelas compras, volte sempre!!!");

    }
}
