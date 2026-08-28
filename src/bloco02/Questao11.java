package bloco02;
/* [Ver Questao 11](../../blocos.Txt/bloco02.txt) */
public class Questao11 {
    public static void main(String[] args) {
        int h = 2, min = 45, s = 30;
        int sT = s + (min * 60) + (h * (60*60));

        int H = sT / (60*60);
        int Min = (sT % (60*60)) / 60;
        int S = sT % 60; 

        System.out.println("Um total de " + sT + " segundos.");
        System.out.printf("%02d:%02d:%02d\n", H, Min, S);
    }   
}