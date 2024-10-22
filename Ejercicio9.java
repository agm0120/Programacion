/*Escribe un programa que pregunte el precio de un producto 
y si es de primera necesidad o no, y calcule su precio con IVA
(teniendo en cuenta que los productos de primera necesidad 
tienen un 10% de IVA y el resto un 21%) */

public class Ejercicio9 {
    public static void main(String[] args) {
        float precio = Float.parseFloat(System.console().readLine("Cuanto cuesta tu producto? "));
        String necesidad = System.console().readLine("Es de primera necesidad? ");

        float preciototal = precio;

        if (necesidad.equals("si")) {
            preciototal = preciototal * 1.10f;

        }
        if (necesidad.equals("no")) {
            preciototal = preciototal + 1.21f;

        }
        System.out.println("El producto le cuesta " + preciototal + " euros.");
    }
}
