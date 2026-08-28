package bloco06;
/* [Ver Questao 45](../../blocosTxt/bloco06.txt) */
import java.util.Arrays;
public class Questao45 {
    public static void main(String[] args) {
        // --- ITEM (a) - Bubble Sort ---
        System.out.println("--- ITEM (a) ---");
        int[] v = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Vetor original: " + Arrays.toString(v));
        
        // Implementação do Bubble Sort
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    // Troca os elementos de lugar
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado: " + Arrays.toString(v));
        System.out.println();

        // --- ITEM (b) - Matriz 3x3 ---
        System.out.println("--- ITEM (b) ---");
        int[][] m = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
        int somaTotal = 0;
        int somaDiagonal = 0;
        
        System.out.println("Matriz formatada em grade:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                // Exibir o elemento formatado com espaço
                System.out.print(m[i][j] + " ");
                // Calcular a soma de todos os elementos
                somaTotal += m[i][j];
                // Verificar e calcula a diagonal principal (onde linha é igual a coluna)
                if (i == j) {
                    somaDiagonal += m[i][j];
                }
            }
            System.out.println(); // Quebra de linha para formar a grade
        }
        System.out.println("Soma de todos os elementos: " + somaTotal);
        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
