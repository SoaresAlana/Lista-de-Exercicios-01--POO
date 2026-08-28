package bloco01;
/* [Ver Questao 01](../../blocos.Txt/bloco01.txt) */
public class Questao01 {
    public static void main(String args[]) {
        int a = 17, b = 5;
        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        int divInt = a / b;
        double divReal = (double) a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + mult);
        System.out.println("Divisao Inteira: " + divInt);
        System.out.println("Divisao Real: " + divReal);
        System.out.println("Resto: " + resto);
    }   
}