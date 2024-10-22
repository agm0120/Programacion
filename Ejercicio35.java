/* Crea un programa que simule una cuenta bancaria.
 * El usuario puede introducir si desea ingresar o retirar
 * dinero y que cantidad.
 * El programa sigue ejecutandose hasta que el saldo sea
 * inferior a cero euros.
 */

public class Ejercicio35 {
    public static void main(String[] args) {

        int saldo = 0;
        int retirar = 0;
        int ingresar = 0;

        do {
        String respuesta = System.console().readLine("¿Que quieres hacer retirar o ingresar? ");
        
            if (respuesta.equals("ingresar")) {
                
                    ingresar = Integer.parseInt(System.console().readLine("Cuanto quieres ingresar?"));
                    saldo = saldo + ingresar;
                    System.out.println("Tienes "+saldo+" euros.");
            }
            else if (respuesta.equals("retirar")){
                    retirar = Integer.parseInt(System.console().readLine("Cuanto quieres retirar?"));
                    saldo = saldo - retirar;
                    System.out.println("Tienes "+saldo+" euros.");
            }
            
        }while (saldo >= 0);
        System.out.println("No tienes mas dinero");
    }

}