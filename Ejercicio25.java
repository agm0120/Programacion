/*Desarrolla un programa que te pregunta una frase y te 
 * la repite. El programa va a repetir tu frase
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        
        

        for (int i = 2;i<100; i++){
            String frase = System.console().readLine("Introduce una frase: ");

            if (frase.equals("para")) {
                break;
            }
            else {
                System.out.println(frase);

            }
        }
    }
}
