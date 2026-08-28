package bloco04;
/* [Ver Questao 31](../../blocos.Txt/bloco04.txt) */
public class Questao31 {
    public static void main(String[] args) {
        int decimal = 156;
        int n = decimal;
        String bin = "";

        while (n > 0) {
            bin = (n % 2) + bin; // bin1 = (17 % 2 = 1) + "_"; bin2 = (8 % 2 = 0) + "1"; bin3 = (4 % 2 = 0) + "01";
                                 // bin4 = (2 % 2 = 0) + "001"; bin5 = (1 % 2 = 1) + "0001";; bin = "10001";

            n /= 2;              // n / 2 = n; (n1 = 17); 
                                 // 17 / 2 = (n2 = 8); 8 / 2 = (n3 = 4); 4 / 2 = (n4 = 2); 2 / 2 = (n5 = 1);
        }
        System.out.println(decimal + " em binario = " + bin);
    }
}