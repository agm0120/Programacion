public class Ejercicio32 {
    public static void main(String[] args) {
        int num = Integer.parseInt(System.console().readLine("Introduce el numero: "));
        
        for(int i = 1; i < num + 1; i++){
        for (int j = 1; j < num + 1; j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
    }
}
