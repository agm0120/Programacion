public class Ejercicio40 {
    public static void main(String[] args) {
        
        
        int num = Integer.parseInt(System.console().readLine("Introduce un número: "));
        int numDivisibles = 0;

        for (int i = 1; i<=num; i++){
            if (num%i==0) {
                numDivisibles++;
            }
        }

        if (numDivisibles==2) {
            System.out.println("Eeeel primoo");
        }
        else if (numDivisibles>2){
            System.out.println("No es primoo");
        }

    }
}
