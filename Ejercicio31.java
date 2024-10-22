/*Programa ucha , que le preguntes cuanto quieres ahorrar y luego cuando vas 
 * metiendo y te avisa cuando tienes suficiente.
 */

public class Ejercicio31 {
    public static void main(String[] args) {
        
        int hucha = 0;
        int dineroA = Integer.parseInt(System.console().readLine("Cuánto dinero quieres ahorrar? "));
        
        /*for (int i = 1; 1 < 2 + 1; i++){
            hucha += Integer.parseInt(System.console().readLine("Cuanto dinero vas a meter? "));
            System.out.println("Tienes " + hucha);
            if (hucha >= dineroA) {

                System.out.println("Has alcanzado tu objetivo");
                break;
            }
            else{
                System.out.println("Te faltan " + (dineroA - hucha));
            }
                */
        do {
            hucha += Integer.parseInt(System.console().readLine("Cuanto dinero vas a meter? "));
            System.out.println("Tienes " + hucha);
            System.out.println("Te faltan " + (dineroA - hucha));
        } while (hucha<dineroA);
        
                /* while (hucha<dineroA) {
                    hucha += Integer.parseInt(System.console().readLine("Cuanto dinero vas a meter? "));
                    System.out.println("Tienes " + hucha);
                    System.out.println("Te faltan " + (dineroA - hucha));
        }*/
        }
    }

