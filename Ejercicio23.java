/*Programa que te pregunte tu edad y 
 * te dice todos los años que has cumplido desde 
 * que naciste (desde 1 hasta la edad que tienes ahora )
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        
        int edad = Integer.parseInt(System.console().readLine("Introduce tu edad: "));

        for (int i = 1;i < edad+1; i++){
            System.out.println("Cumpliste " + i + " hace " + (edad-i) + " años.");

        }
    }
}
