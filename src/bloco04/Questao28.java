package bloco04;
/* [Ver Questao 28](../../blocos.Txt/bloco04.txt) */
public class Questao28 {
    public static void main(String[] args) {
        int n = 10;
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        System.out.println(n +"! = "+ resultado);
    }
}