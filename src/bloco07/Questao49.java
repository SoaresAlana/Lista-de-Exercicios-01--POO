package bloco07;
/* [Ver Questao 49](../../blocos.Txt/bloco07.txt) */
public class Questao49 {
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            System.out.print(i + "! = " + fatorial(i));
            if (i < 12) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }
}