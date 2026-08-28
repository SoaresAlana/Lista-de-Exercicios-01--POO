package bloco06;
/* [Ver Questao 42](../../blocosTxt/bloco06.txt) */
public class Questao42 {
    public static void main(String[] args) {
        int[] v = {-3, 8, 0, 15, -7, 4, -1, 22, 0, 9};
        
        int p = 0; // Positivos
        int n = 0; // Negativos
        int z = 0; // Zeros
        int somaP = 0; // Soma dos Positivos
        
        for (int num : v) {
            if (num > 0) {
                p++;
                somaP += num;
            } else if (num < 0) {
                n++;
            } else {
                z++;
            }
        }
        System.out.println("Quantidade de positivos: " + p);
        System.out.println("Quantidade de negativos: " + n);
        System.out.println("Quantidade de zeros: " + z);
        System.out.println("Soma dos numeros positivos: " + somaP);
    }
}