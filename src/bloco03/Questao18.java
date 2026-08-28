package bloco03;
/* [Ver Questao 18](../../blocos.Txt/bloco03.txt) */
public class Questao18 {
    public static void main(String[] args) {
        int ano = 2024;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano "+ ano +" e bissexto.");
        } else {
            System.out.println("O ano "+ ano + " nao e bissexto.");
        }
    }   
}