package bloco02;
/* [Ver Questao 12](../../blocos.Txt/bloco02.txt) */
public class Questao12 {    
    public static void main(String[] args) {
        double RS = 150.0;
        double D, E, L;
        D = RS * 5.2;
        E = RS * 5.65;
        L = RS * 6.4;

        System.out.printf("%.2f BRA (reais).%n", RS);
        System.out.printf("%.2f USD (dolares).%n", D);
        System.out.printf("%.2f EUR (euros).%n", E);
        System.out.printf("%.2f GBP (libras esterlinas).%n", L);
    }
}