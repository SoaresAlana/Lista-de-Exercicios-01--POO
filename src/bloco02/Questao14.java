package bloco02;
/* [Ver Questao 14](../../blocos.Txt/bloco02.txt) */
public class Questao14 {    
    public static void main(String[] args) {
        double kmh = 90.0;
        double ms = kmh / 3.6;
        double mph = kmh / 1.609; 

        System.out.println(kmh + " km/h (quilometros por hora).");
        System.out.println(ms + " m/s (metros por segundo).");
        System.out.println(mph + " mph (milhas por hora).");
    }
}