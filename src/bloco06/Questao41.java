package bloco06;
/* [Ver Questao 41](../../blocosTxt/bloco06.txt) */
public class Questao41 {
    public static void main(String[] args) {
        int[] v = {34, 7, 89, 23, 56, 12, 78, 45};

        int maior = v[0];
        int menor = v[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        // Loop para encontrar os valores e índices
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {  // Maior
                maior = v[i];      // Valor
                indiceMaior = i;   // Índice
            }
            if (v[i] < menor) {  // Menor
                menor = v[i];      // Valor
                indiceMenor = i;   // Índice
            }
        }
        System.out.println("Maior valor: " + maior +" (Indice: "+ indiceMaior +")");
        System.out.println("Menor valor:  " + menor +" (Indice: "+ indiceMenor +")");
    }
}