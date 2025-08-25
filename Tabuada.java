public class Tabuada {
    public static void main(String[] args) {

        //Laço externo que controla o numero da tabuada de 1 a 10
        for (int i = 1; i <= 10; i ++){
            System.out.println("Tabuada do " + i + ":");


            //Laço interno que controla o multiplicador
            for (int j = 1; j <= 10; j ++){
                int resultado = i * j; //calculo do produto
                System.out.println( i + " x " + j + " = " + resultado);
            }
        }

        System.out.println(" _____________________________ ");
    }
}
