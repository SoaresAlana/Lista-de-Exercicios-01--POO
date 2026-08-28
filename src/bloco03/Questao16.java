package bloco03;
/* [Ver Questao 16](../../blocos.Txt/bloco03.txt) */
public class Questao16 {    
    public static void main(String[] args) {
        int n = -8;

        if (n % 2 == 0) {
            if (n > 0) {
                System.out.println("O numero "+ n +" e positivo e par.");
            } else if (n < 0) {
                System.out.println("O numero "+ n +" e negativo e par.");
            }
        } else if (n % 2 == 1) {
            if (n > 0) {
                System.out.println("O numero "+ n +" e positivo e impar.");
            } else if (n < 0) {
                System.out.println("O numero "+ n +" e negativo e impar.");
            }
        } else {
            System.out.println("O numero "+ n +" e zero, portanto, nao e positivo nem negativo e nao e impar nem par.");
        }
    }
}