package bloco03;
/* [Ver Questao 20](../../blocos.Txt/bloco03.txt) */
public class Questao20 { 
    public static void main(String[] args) { 
        double c = 750.0; 
        double d = 0.0; 
        int dP = 0; 
        double pF; 
        
        if (c < 100.0) { 
            d = 0.0 * c; 
            dP = 0; 
        } else if ((c >= 100.0) && (c <= 500.0)) { 
            d = 0.05 * c; 
            dP = 5; 
        } else if ((c > 500.0) && (c < 1000.0)) { 
            d = 0.1 * c; 
            dP = 10; 
        } else { 
            d = 0.15 * c; 
            dP = 15; 
        } 
        
        pF = c - d; 
        
        System.out.printf("Valor original: R$ %.2f%n", c); 
        System.out.printf("Desconto aplicado: %d%%%n", dP); 
        System.out.printf("Valor do desconto: R$ %.2f%n", d); 
        System.out.printf("Preco final: R$ %.2f%n", pF); 
    } 
}