package bloco02;
/* [Ver Questao 09](../../blocos.Txt/bloco02.txt) */
public class Questao09 {
    public static void main(String[] args) {
        double C = 37.5;
        double F = C * (9/5) + 32;
        double K = 273.15 + C;

        System.out.printf("Fahrenheit: %.2f °F\n", F);
        System.out.printf("Kelvin: %.2f K\n", K);
    }
}