/*Pide el usuario que introduzca caracteres uno por uno y
 * cuenta cuantas vocales ha introducido.
 * El bucle termina cuando el usuario introduce un 0.
 */

public class Ejercicio34{
    public static void main(String[] args) {
        String caracter;
        int vocales = 0;
        int consonantes = 0;

        do {    
            caracter = System.console().readLine("Introduce una letra: ");

        if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u")) {
            vocales++;
        }

        else if (caracter == "0"){
            
        }

        else {
            consonantes++;
        }
        }while (!caracter.equals("0"));
    
        System.out.println("Fin del programa");
        System.out.println("Hay " + vocales + " vocales, y " + (consonantes - 1) + " consonantes.");
    }
}