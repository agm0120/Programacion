/*Realiza un programa que te haga una tabla
 * de multiplicar depende de el número que 
 * tu le digas.
 */

public class Ejercicio20 {
    public static void main(String[] args) {
    
        int numero = Integer.parseInt(System.console().readLine("Introduce el numero: "));    
        
        for(int i = 0; i <11 ; i++){

            System.out.println(numero + " x " + i + " = " +  numero*i);
        }
    }
}
