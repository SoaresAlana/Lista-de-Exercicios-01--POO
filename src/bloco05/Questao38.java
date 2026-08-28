package bloco05;
/* [Ver Questao 38](../../blocos.Txt/bloco05.txt) */
public class Questao38 {
    public static void main(String[] args) {
        int contrato = 1;
        double salarioBruto = 5000.0;
        double pDesconto = 0.0;

        switch (contrato) {
            case 1:
                pDesconto = 0.275; // 27,5%
                break;
            case 2:
                pDesconto = 0.15; // 15,0%
                break;
            case 3:
                pDesconto = 0.11; // 11,0%
                break;
            default:
                System.out.println("Codigo de contrato invalido.");
                return;
        }
        double desconto = salarioBruto * pDesconto;
        double salarioLiquido = salarioBruto - desconto;
        
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Salario Liquido: R$ %.2f%n", salarioLiquido);
    }
}