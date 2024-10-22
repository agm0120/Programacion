/*Un bucle se pretende imprimir todos los numeros
 * del 0 al 100, pero se interrumpe en el número 
 * que le diga el usuario
 */

public class Ejercicio27 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Hasta que numero quieres que cuente del 0 al 100? "));

        for (int i = 0;i < 100 + 1; i++){ 
            System.out.println(i);         
        if (i == numero) {
            break;
        }

        }
        
        }
    }

