/* Desarrolla un programa que introduciendo el numero de
 * dias de la semana te diga que dia es (ejemplo 3 es miercoles
 * , 7 es de domingo).
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(System.console().readLine("Que dia de la semana es? "));

        if (dia == 1){
            System.out.println("Lunes");
        }
        else if (dia == 2){
            System.out.println("Martes");

        }else if (dia == 3){
            System.out.println("Miercoles");
        }
        else if (dia == 4){
            System.out.println("Jueves");
        }       
        else if (dia == 5){
            System.out.println("Viernes");
        }
        else if (dia == 6){
            System.out.println("Sabado");
        }
        else if (dia == 7){
            System.out.println("Domingo");
        }

    }
    
}