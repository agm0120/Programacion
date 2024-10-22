/*Programa que imprime todos los numeros pares desde el 
 * 2 hasta el que diga el usuario.
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Introduce el numero: "));
        
        System.out.println("Los numeros son ");

        for (int i = 2;i <= numero; i=i+2){
            System.out.println("" + i + "");

        }
    }   
}
