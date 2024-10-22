/*Desarrolla un programa que pregunte al 
 * usuario el número de dorsal de un equipo
 * y muestre el nombre de jugador que tiene 
 * ese dorsal.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int dorsal = Integer.parseInt(System.console().readLine("Número dorsal: "));

        if (dorsal == 1){
            System.out.println("Adrián garrido");
        }
        else if (dorsal == 11){
            System.out.println("Francisco Martos");

        }else if (dorsal == 2){
            System.out.println("Adrián Jimenez");

        }else if (dorsal == 10){
            System.out.println("Berna");

        }
    }
}
