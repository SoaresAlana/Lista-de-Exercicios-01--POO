package bloco06;
/* [Ver Questao 40](../../blocosTxt/bloco06.txt) */
public class Questao40 {
    public static void main(String[] args) {
        // Array do exercício anterior
        int[] notas = {72, 85, 91, 68, 77, 95, 60, 88};
        double soma = 0; // Double para facilitar o cálculo da média depois
        double m;
        int acimaDaMedia = 0;
        // Soma
        for (int nota : notas) {
            soma += nota;
        }
        // Média
        m = soma / notas.length;
        // A quantidade de notas acima da média
        for (int nota : notas) {
            if (nota > m) {
                acimaDaMedia++;
            }
        }
        System.out.println("Soma de todos os elementos: " + (int)soma);
        System.out.printf("Media das notas: %.2f\n", m);
        System.out.println("Quantidade de notas acima da media: " + acimaDaMedia);
    }
}