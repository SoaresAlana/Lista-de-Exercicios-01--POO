package bloco01;
/* [Ver Questao 05](../../blocos.Txt/bloco01.txt) */
public class Questao05 {
    public static void main(String args[]) {
        double n1 = 7.5, n2 = 8.0, n3 = 6.5, n4 = 9.0;
        double mA = (n1 + n2 + n3 + n4) / 4;
        double mP = (n1*1 + n2*2 + n3*3 + n4*4) / (1 + 2 + 3 + 4);
        System.out.println("Média Aritmética: " + mA);
        System.out.println("Média Ponderada: " + mP);
    }
}