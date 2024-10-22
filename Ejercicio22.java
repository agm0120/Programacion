/*Desarrolla un programa que pregunte un saludo al
 * usuario y le pregunte cuantas veces quiere repetirlo. 
 * El programa repetirá el saludo tantas veces como el
 * usuario haya indicado.
 */

public class Ejercicio22 {
    public static void main(String[] args) {
        
        String texto = System.console().readLine("Que es lo que quieres que se repita? ");
        int numeroR = Integer.parseInt(System.console().readLine("Número de veces que se quiera repetir? "));

        for(int i = 0; i < numeroR + 1 ; i++){
            
            System.out.println(i + ". " + texto);
        }
    }
}
