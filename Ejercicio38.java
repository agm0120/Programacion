public class Ejercicio38 {
    public static void main(String[] args) {
        int base = Integer.parseInt(System.console().readLine("Introduce la base: "));
        int exponente = Integer.parseInt(System.console().readLine("Introduce el exponente: "));
        int resultado = base;

        for(int i = 1;i<exponente; i++){
            resultado = resultado * base; //resultado *= base
        }

        System.out.println(resultado);
    }
}
