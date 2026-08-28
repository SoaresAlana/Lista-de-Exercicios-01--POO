package bloco04;
/* [Ver Questao 29](../../blocos.Txt/bloco04.txt) */
public class Questao29 {
    public static void main(String[] args) {
        int ant = 0;
        int atu = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(ant + " ");
            
            int prox = ant + atu;
            ant = atu;
            atu = prox;
        }
    }
}