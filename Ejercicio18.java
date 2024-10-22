/*Realiza un programa que muestre al azar el nombre 
de una carta de la baraja de póquer. Esta baraja está
dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas,
de las cuales 9 cartas son numerales y 4 literales:
2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
Tu programa deberá mostrar algo como “4 de picas”, “J de tréboles”, etc. */

public class Ejercicio18 {
    public static void main(String[] args) {
        int palos = (int) (Math.random()* 4 + 1);
        int numCartas = (int) (Math.random()* 14 + 1);
        String palo = "";
        switch (palos) {
            case 1:
                palo = "Picas";
                break;
            
            case 2:
                palo = "Corazones";
                break;
            
            case 3:
                palo = "Treboles";
                break;
            
            case 4:
                palo = "Diamantes";
                break;
        }

        String carta = "";
        switch (numCartas) {
            case 1:
                carta = "1";
                break;
            
            case 2:
                carta = "2";                
                break;
            
            case 3:
                carta = "3";
                break;
            
            case 4:
                carta = "4";
                break;
            
            case 5:
                carta = "5";
                break;
            
            case 6:
                carta = "6";
                break;
            
            case 7:
                carta = "7";
                break;
            
            case 8:
                carta = "8";
                break;

            case 9:
                carta = "9";
                break;
                
            case 10:
                carta = "10";
                break;

            case 11:
                carta = "J";
                break;
            
            case 12:
                carta = "Q";
                break;
                
            case 13:
                carta = "K";
                break;
                
            case 14:
                carta = "A";
                break;
        }
        System.out.println(carta + " de " + palo);
    }
}
