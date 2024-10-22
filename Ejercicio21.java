/*Desarrolla un programa que muestre los numeros desde
 * el que diga el usuario hasta el 0 (contando hacia atras)
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Introduce tu numero: "));

        for(int i = numero; i >= 0; i--){
            System.out.println(i);

    }
}
}
