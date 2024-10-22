/*Un bucle imprime todos los números del 0 al 100
 * excepto el que te diga el usuario
 */

public class Ejercicio28 {
    public static void main(String[] args) {
     
        int num = Integer.parseInt(System.console().readLine("Di el numero que quieres que se salte al contar del 0 al 100? "));

        for (int i = 0; i < 100; i++){
            if (num == i){
                continue;
            
            }
            System.out.print("  " + i);
        }
    }
}
