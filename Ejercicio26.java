/*Programa que te pide una contraseña y te 
 * dice si has acertado. Tienes 3 intentos.
 * Si te equivocas pasa al segundo intento
 * y si finalizas los intentos se acaba el programa. Si
 * aciertas, te dice que has acertado y ya no te pregunta más.
 */

public class Ejercicio26 {
    public static void main(String[] args) {
        String contrasena = "ñ";


        for (int i = 0;i < 3; i++){
            String respuesta = System.console().readLine("Introduce la ñ --> ");
            if (respuesta.equals(contrasena)) {
                System.out.println("Has acertado ");
                break;
            }
            else {
                System.out.println("Eres estadounidense? Te estas equivocando ");

            }
        }
    }
}
