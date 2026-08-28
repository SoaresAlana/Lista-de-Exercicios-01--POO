package bloco06;
/* [Ver Questao 43](../../blocosTxt/bloco06.txt) */
public class Questao43 {
    public static void main(String[] args) {
        int[] d = {11, 33, 55, 77, 99, 22, 44, 66};
        int alvo = 77;
        int indice = -1;

        for (int i = 0; i < d.length; i++) {
            if (d[i] == alvo) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println("Indice: " + indice);
        } else {
            System.out.println("Nao encontrado.");
        }
    }
}