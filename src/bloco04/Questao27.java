package bloco04;
/* [Ver Questao 27](../../blocos.Txt/bloco04.txt) */
public class Questao27 {
    public static void main(String[] args) {
        // Loop Externo -- Tabuada (de 1 a 5) -- À esquerda
        for (int t = 1; t <= 5; t++) {
            System.out.println("–- Tabuada do " + t + " –-");
           
            // Loop Interno -- Multiplicadores (de 1 a 10) -- À direita
            for (int i = 1; i <= 10; i++) {
                System.out.println(t + " x " + i + " = " + (t * i));
            }
        }
    }
}