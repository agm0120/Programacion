/*Realizar un algoritmo que pida números (se 
 * pedira por sonsola la cantidad de números a introducir).
 * El programa, al finalizar debe informar de cuantos números introducidos
 * son mayores que 100, cuantosm menores que 100 y cuantos iguales a 100. */

public class Ejercicio30 {
    public static void main(String[] args) {
        
        int numeros = Integer.parseInt(System.console().readLine("Cuantos numeros quieres introducir? "));
        int numerosIntroducidos = 0;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        for (int i = 1; i < numeros + 1; i++){

            numerosIntroducidos = Integer.parseInt(System.console().readLine("Introduce el numero: "));
            if (numerosIntroducidos < 100) {
                menor = menor + 1;
            }
            else if (numerosIntroducidos == 100){
                igual = igual + 1;
            }
            else if (numerosIntroducidos > 100){
                mayor = mayor + 1;
            }

        }
        System.out.println(mayor + " son/es mayor/es de 100. " + menor + " número/s son/es menor/es que 100. Y " + igual + " número/s son/es iguales.");


    }
}
