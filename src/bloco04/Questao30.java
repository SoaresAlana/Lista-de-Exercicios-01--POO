package bloco04;
/* [Ver Questao 30](../../blocos.Txt/bloco04.txt) */
public class Questao30 {
    public static void main(String[] args) {
        int n = 9876;
        int soma = 0;

        while (n > 0) {
            soma = soma + (n % 10);
            n /= 10;
        }
        System.out.println("Soma dos digitos: " + soma);
    }
}
