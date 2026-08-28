package bloco03;
/* [Ver Questao 19](../../blocos.Txt/bloco03.txt) */
public class Questao19 {
    public static void main(String[] args) {
        double a = 5.0, b = 5.0, c = 8.0;

        // (a) Validez do triângulo a partir da soma dos lados
        boolean valido = (a < b + c) && (b < a + c) && (c < a + b);

        if (valido) {
            System.out.println("Os lados formam um triangulo valido.");

            // (b) Classificação do triângulo
            if (a == b && b == c) {
                System.out.println("E um triangulo equilatero");
            } else if (a == b || a == c || b == c) {
                System.out.println("E um triangulo isosceles");
            } else {
                System.out.println("E um triangulo escaleno");
            }
        } else {
            System.out.println("Os lados NAO formam um triangulo valido.");
        }
    } 
}