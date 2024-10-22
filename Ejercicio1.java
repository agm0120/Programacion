public class Ejercicio1 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(System.console().readLine("Introduce la edad que tienes: "));
        
        if (edad >= 18){

            System.out.println("Puedes entrar.");
        }
        else  {
            System.out.println("No puedes entrar, eres menor.");
    
            }
    }
}
