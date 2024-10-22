/*Programa que te pide una cantidad inicial de una inversión,
el interés anueal y el numero de años, y te devuelve la cantidad
ganada cada año. (Por ejemplo, un 10% de beneficio pero siempre
con respecto a la cantidad que tienes del año anterior)
10000€
10 años 
5 % cada año

AÑO 1: 1000€
AÑO 2: 1050€
AÑO 3: 1102.50€
 */

public class Ejercicio36 {
    public static void main(String[] args) {
       
        float dineroIn = Float.parseFloat(System.console().readLine("¿Cuanto dinero quieres invertir? "));
        float anos =  Float.parseFloat(System.console().readLine("¿Durante cuantos años? "));
        float porcentaje =  Float.parseFloat(System.console().readLine("¿Que porcentaje aumenta cada año? "));

        float total = (float) dineroIn;

        for (int i = 1; i < anos + 1; i++){
            total = total + (total * porcentaje/100f);
            System.out.println("Año " + i + ": " + total + " euros");
            }

    }
}
