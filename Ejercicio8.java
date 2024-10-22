/*Tienda de banderas:
 * Se pide ancho y alto en cm. se cobra a 2cents el cm2.
 * Se pregunta si se desea escudo bordado (2.5€) y si se 
 * envia o se recoge (envio 5€)
 * Se muestra el precio total.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        float ancho = Float.parseFloat(System.console().readLine("Ancho de la bandera: "));
        float alto = Float.parseFloat(System.console().readLine("Alto de la bandera: "));
        String escudoBordado = System.console().readLine("Quieres que se borde el escudo: ");
        String envio = (System.console().readLine("Quieres envio? "));

        float preciototal = (ancho*alto)*0.02f;


        if (escudoBordado.equals("si")){
            preciototal = preciototal + 2.5f;

        }
        if (envio.equals("si")){
            preciototal = preciototal + 5f;

        }
        System.out.println("La bandera le costará " + preciototal + " euros.");
    }
}
