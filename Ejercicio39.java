public class Ejercicio39 {
    public static void main(String[] args) {
        String respuesta = "";

        while (true) {
            respuesta = System.console().readLine("Quieres terminar el programa? (s/n) ");

            if (respuesta.equals("s")) {
                System.out.println("Saliendo ...");
                break;
            } 
            else if (respuesta.equals("n")){
                System.out.println("Continuamos ...");
            }
            else {
                System.out.println("Respuesta no válida");
            }

        }
    }
}
