/*Programa que calcula la media de varias notas,
 * pero que de primeras no sabemos cuántas notas son.
 * Lo primero, por tanto, es preguntar al usuario cuantas 
 * notas son, despues preguntar todas las notas, y por 
 * ultimo mostrar la media.
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        int nNotas = Integer.parseInt(System.console().readLine("De cuántas notas quieres calcular la media? "));
        float notasTotales = 0f;

        for (int i = 1; i < nNotas + 1; i++){
        float notas = Integer.parseInt(System.console().readLine("Introduce la nota " + i + ": "));
        notasTotales = notasTotales + notas;
        //notasTotales += + notas; es lo mismo que lo de arriba
        }

        System.out.println("Tu nota media es: " + (notasTotales / nNotas));

    }
}
