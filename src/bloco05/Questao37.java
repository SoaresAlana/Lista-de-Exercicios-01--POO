package bloco05;
/* [Ver Questao 37](../../blocos.Txt/bloco05.txt) */
public class Questao37 {
    public static void main(String[] args) {
        int turno = 2;

        switch (turno) {
            case 1:
                System.out.println("Bom dia!");
                break;
            case 2:
                System.out.println("Boa tarde!");
                break;
            case 3:
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Turno invalido!");
                break;
        }
    }
}