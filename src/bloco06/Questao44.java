package bloco06;
/* [Ver Questao 41](../../blocosTxt/bloco06.txt) */
import java.util.Arrays;
public class Questao44 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // Exibe o array antes da inversão
        System.out.println("Antes: " + Arrays.toString(arr));
        // Loop para inverter o array in-place
        for (int i = 0; i < arr.length / 2; i++) {
            // Variável temporária para a troca
            int temp = arr[i];
            
            // Inverte para as posições correspondentes
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // Depois da inversão
        System.out.println("Depois: " + Arrays.toString(arr));
    }
}