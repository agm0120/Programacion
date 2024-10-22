/*Calculador de nómina. Programa que te pide nº de
 * horas semanales y calcula tu nomina semanal, 
 * teniendo en cuenta que las primeras 40h se cobran
 * a 10€ y las siguientes (horas extras) a 12€.
 * 30h -> 300€
 * 40h -> 400€
 * 41h -> 412€
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        int horas = Integer.parseInt(System.console().readLine("Introduce el número de horas semanales de trabajo: "));
        int dinero = 0;

        // Ámbito de las variables

        if (horas <= 40){
            dinero = horas * 10;
            System.out.println("Tu nomina semanal es " + dinero + " euros.");
        }

        else if (horas > 40){
            dinero = 40 * 10 + ((horas-40) * 12);
            System.out.println("Tu nomina semanal es " + dinero + " euros.");
        }
        else {
            System.out.println("Número de horas incorrectas.");

        }
        

    }
}
