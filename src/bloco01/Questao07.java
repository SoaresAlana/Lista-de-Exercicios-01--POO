package bloco01;
/* [Ver Questao 07](../../blocos.Txt/bloco01.txt) */
public class Questao07 {
    public static void main(String args[]) {
        double s = 3200.00, p = 8.5;
        double a, s_a;

        a = s / p;
        s_a = s + a;

        /* O valor do aumento e a diferença entre o antigo e o novo sálario é a mesma coisa */
        System.out.print("Valor do Aumento: R$ " + a);
        System.out.println("Novo salário: R$ " + s_a);
    }   
}