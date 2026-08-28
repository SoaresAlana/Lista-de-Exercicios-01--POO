package bloco03;
/* [Ver Questao 23](../../blocos.Txt/bloco03.txt) */
public class Questao23 {
    public static void main(String[] args) {
        // x² - 5x + 6 = 0
        double a = 1;
        double b = -5;
        double c = 6;

        // Delta (Δ) == delta = 1.00
        double delta = (b*b) - (4*a*c);

        if (delta < 0) {
            System.out.println("Sem raizes reais.");
        } else {
            System.out.println("As raizes sao:");

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);

            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x2 = " + x2);
        }
    }
}
