public class Crescimento {
    public static void main(String[] args) {

        //Alturas iniciais em cm
        int alturaFrancisco = 150;
        int alturaSara = 110;

        //crescimento em cm
        int cresceimentoFrancisco = 2;
        int crescimentoSara = 3;

        int anos = 0;

        while (alturaSara <= alturaFrancisco){
            alturaFrancisco += cresceimentoFrancisco;
            alturaSara += crescimentoSara;
            anos ++;
        }
        System.out.println("Sara sera maior que Francisco em " + anos + " anos");
        System.out.println("Altura final de sara: " + alturaSara + "cm");
        System.out.println("Altura final de Francisco: " + alturaFrancisco + "cm");
        System.out.println("Sara ficara maior que Francisco em " + anos + " anos ");
    }
}
