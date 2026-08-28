package bloco03;
/* [Ver Questao 21](../../blocos.Txt/bloco03.txt) */
public class Questao21 {
    public static void main(String[] args) {
        // Declaração das variáveis
        int maior, menor;
        int x = 42;
        int y = 17;
        int z = 89;

        //O Maior Número
        if (x >= y && x >= z) {
            maior = x;
        } else if (y >= x && y >= z) {
            maior = y;
        } else {
            maior = z;
        }

        //O Menor Número
        if (x <= y && x <= z) {
            menor = x;
        } else if (y <= x && y <= z) {
            menor = y;
        } else {
            menor = z;
        }

        System.out.println("O maior numero: " + maior);
        System.out.println("O menor numero: " + menor);
    }
}