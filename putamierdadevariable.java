public class putamierdadevariable {
    public static void main(String[] args) {
        float deposito =  Float.parseFloat(System.console().readLine("Cuantos litros caben en su deposito: "));
        float recorrido = Float.parseFloat(System.console().readLine("Cuantos kilometros ha hecho: "));
        final float kilometros = 100;

        float total = (deposito / recorrido) * kilometros;

        System.out.println("Has gastado un total de " + total + " litros por cada 100km.");

    }
}
