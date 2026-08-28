package bloco03;
/* [Ver Questao 17](../../blocos.Txt/bloco03.txt) */
public class Questao17 {
    public static void main(String[] args) { 
        // Na questão 4 (Questao04) o valor de IMC foi 23.51
        double IMC = 23.51;

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Peso normal.");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Sobrepeso.");
        } else if (IMC >= 30 && IMC < 35) {
            System.out.println("Obesidade I.");
        } else if (IMC >= 35 && IMC < 40) {
            System.out.println("Obesidade II.");
        } else {
            System.out.println("Obesidade III.");
        }
    }
}