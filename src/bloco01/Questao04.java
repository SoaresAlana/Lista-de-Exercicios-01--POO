package bloco01;
/* [Ver Questao 04](../../blocos.Txt/bloco01.txt) */
public class Questao04 {
    public static void main(String args[]) {
        double p = 72, h = 1.75;
        double IMC = p / (h * h);
        System.out.println(String.format("IMC: %.2f", IMC));
    }
}