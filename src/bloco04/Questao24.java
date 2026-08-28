package bloco04;
/* [Ver Questao 24](../../blocos.Txt/bloco04.txt) */
public class Questao24 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            String tipo = (i % 2 == 0) ? "[P]" : "[I]";
            System.out.print(i + tipo + " ");
        }
    }
}