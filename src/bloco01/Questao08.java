package bloco01;
/* [Ver Questao 08](../../blocos.Txt/bloco01.txt) */
public class Questao08 {
    public static void main(String args[]) {
        int b = 3, e = 5, a1, q, c;
        a1 = (int) Math.pow(b, e);
        q = (int) Math.pow(b, 2);
        c = (int) Math.pow(b, 3);
        
        System.out.println("base = " + b + " e expoente = " + e);
        System.out.println("base^expoente = b^e = " + a1);
        System.out.println("base^quadrado = b^2 = " + q);
        System.out.println("base^cubo = b^3 = " + c);
    }   
}