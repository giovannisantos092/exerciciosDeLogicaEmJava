import java.util.Random;

public class numeroAleatorio {
    public static void main(String[] args) {

        //OBjeto random criado
        Random random =  new Random();

        //gera um numero inteiro aleatorio
        //o metodo nextInt (101) gera um valor fr 0 (inclusive) ate 101 (exclusivo).
        //isso resulta em um numero aleatorio de 0 a 100
        int numeroAleatorio = random.nextInt(101);

        System.out.println("O valor aleatorio gerado e : " + numeroAleatorio);
    }
}
