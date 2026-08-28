package bloco07;
/* [Ver Questao 47](../../blocos.Txt/bloco07.txt) */
public class Questao47 {
    // Área do retângulo (base * altura)
    public static double calcularArea(double base, double alt) {
        return base * alt;
    }
    // Perímetro do retângulo (2 *(base + altura))
    public static double calcularPerimetro(double base, double alt) {
        return 2 * (base + alt);
    }
    public static void main(String[] args) {
        double base = 8.0;
        double altura = 5.0;
        // Métodos
        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        System.out.println("Base: "+ base);
        System.out.println("Altura: "+ altura);
        System.out.println("Area do retangulo: "+ area);
        System.out.println("Perimetro do retangulo: "+ perimetro);
    }
}