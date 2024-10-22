public class Ejercicio37 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduce un numero: "));

        for (int i = numero-1; i>0; i--){
            numero = numero * 1;

            System.out.println(numero);
        }
    }
}
