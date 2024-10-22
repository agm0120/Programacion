/*Escribe un programa que te pregunte la nota que has 
 * sacado en una asignatura y te diga si corresponde
 * a un insuficiente, suficiente, bien, notable o sobresaliente.
 * 0-5: suspenso
 * 5-6 suficiente
 * 6-7 bien 
 * 7-9 notable
 * 10 sobresaliente
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        float nota = Float.parseFloat(System.console().readLine("Que nota has sacado? "));
        
        if (nota>=0 && nota<=4.9f){
            System.out.println("Suspenso");
        }
        else if (nota>=5 && nota<=5.9f){
            System.out.println("Suficiente");

        }
        else if (nota>=6 && nota<=6.9f){
            System.out.println(" Bien");

        }
        else if (nota>=7 && nota<=8.9f){ 
            System.out.println("Notable");
        }
        else if (nota>=9 && nota<=10){ //if anidados
            System.out.println("Sobresaliente");
        }
        else {
            System.out.println("Si hombre");

        }
    }
}
