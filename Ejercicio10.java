/*Realiza un pequeño cuestionario tipo test de 5
 * preguntas, que se autocorrijan y te muestre la
 * nota al terminar.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        String respuesta1 = System.console().readLine("El Mengibar va primero en la liga? ");
        String respuesta2 = System.console().readLine("Va ha ganar campillo del Rio en liga? ");
        String respuesta3 = System.console().readLine("Hay 29 personas en clase? ");
        String respuesta4 = System.console().readLine("Yerai es de campillo? ");
        String respuesta5 = System.console().readLine("Es probable que me pare un penalti? ");
        int puntostotales = 0;

        if (respuesta1.equals("si")){
            puntostotales = puntostotales + 2;


        }
        else if (respuesta1.equals("no")){
            System.out.println("Respuesta correcta: si");

        }

        if (respuesta2.equals("no")){
            puntostotales = puntostotales + 2; 

        }
        else if (respuesta1.equals("si")){
            System.out.println("Respuesta correcta: no");

        }

        if (respuesta3.equals("si")) {
            puntostotales = puntostotales + 2;

        }
        else if (respuesta1.equals("no")){
            System.out.println("Respuesta correcta: si");

        }

        if (respuesta4.equals("si")) {
            puntostotales = puntostotales + 2;

        }
        else if (respuesta1.equals("no")){
            System.out.println("Respuesta correcta: si");

        }
        if (respuesta5.equals("si")) {
            puntostotales = puntostotales + 2;

        }
        else if (respuesta1.equals("no")){
            System.out.println("Respuesta correcta: si");

        }


        System.out.println("Has sacado un " + puntostotales);
    }
}
