package bloco02;
/* [Ver Questao 13](../../blocos.Txt/bloco02.txt) */
public class Questao13 {    
    public static void main(String[] args) {
        double g = 47550.0;
        double kg, t, mg;
        kg = g / 1000;
        t = kg / 1000;
        mg = g * 1000;

        System.out.printf("%.1f g (gramas).%n", g);
        System.out.printf("%.3f kg (quilogramas).%n", kg);
        System.out.printf("%.5f t (toneladas).%n", t);
        System.out.printf("%.1f mg (miligramas).%n", mg);
    }
}