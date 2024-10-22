/*Crea un programa que genere un numero 
 * aleatorio entre 1 y 100 y pida al usuario 
 * que lo adivine.El programa debe seguir 
 * preguntando una y otra vez hasta que 
 * el usuario realmente lo acierte (sin 
 * numero maximo de intentos).Tras cada 
 * pregunta, irá diciendo si el numero buscado es mayor o
 * menor que el introducido, para dar pistas al usuario.
 */

public class Ejercicio33 {
    public static void main(String[] args) {
    
    int num = (int) (Math.random()*100+1);

    while (true) {
        int numIntroducido = Integer.parseInt(System.console().readLine("Introduce el número: "));

        if (numIntroducido<num) {
            System.out.println("Tu número es menor, introduce uno mas alto");
        }
        else if (numIntroducido>num){
            System.out.println("Tu numero es mayor, introduce uno mas bajo");
        }
        else if (numIntroducido==num){
            System.out.println("Lo has acertado");
            break;
        }
        else{
            System.out.println("Error");
        }

    }
    }
}
