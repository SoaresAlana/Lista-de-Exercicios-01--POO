package bloco01;
/* [Ver Questao 03](../../blocos.Txt/bloco01.txt) */
public class Questao03 {
    public static void main(String args[]) {
        double a = 6.0, b = 8.0, c = 10.0;
        double s, A;
        s = (a+b+c) / 2;
        A = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area: " + A);
    }   
}