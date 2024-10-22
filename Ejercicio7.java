/*Escribe un programa que nos diga si un número es par 
 * o es impar.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Cual es tu numero: "));

        if (numero % 2 == 0){
            System.out.println("Par");

        }
        else{
System.out.println("Impar");

        }
    }
}
