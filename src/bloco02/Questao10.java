package bloco02;
/* [Ver Questao 10](../../blocos.Txt/bloco02.txt) */
public class Questao10 {
    public static void main(String[] args) {
        double m = 2.5;
        double km, cm, mm, p;
        km = m / 1000;
        cm = m * 100;
        mm = m * 1000;
        p = m / 0.0254;

        System.out.println(m +" m (metros)");
        System.out.println(km +" km (quilometros)");
        System.out.println(cm +" cm (centimetros)");
        System.out.println(mm +" mm (milimetros)");
        System.out.println(p +" p (polegadas)");
    }   
}