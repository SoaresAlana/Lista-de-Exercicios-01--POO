package bloco03;
/* [Ver Questao 22](../../blocos.Txt/bloco03.txt) */
public class Questao22 {
    public static void main(String[] args) {
        int n = 153;              // Número (n)
        int c = n / 100;          // Centena (c)
        int d = (n / 10) % 10;    // Dezena (d)
        int u = n % 10;           // Unidade (u)

        // Cálculo da soma dos cubos dos dígitos
        int somaCubos = (c*c*c) + (d*d*d) + (u*u*u);
        
        if (somaCubos == n) {
            System.out.println(n + " é um número de Armstrong.");
        } else {
            System.out.println(n + " não é um número de Armstrong.");
        }
    }
}