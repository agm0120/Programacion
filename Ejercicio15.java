/*Desarrolla un programa con el que puedas jugar 
 * al piedra, papel o tijera.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        
        //Math.random() genera numero aleatorios entre 0 y 1
        //Yo quiero:
        //- Entre 0 y 2 
        //- No quiero decimales
        
        int numAl = (int) (Math.random()*3)+1;
        
        
        switch (numAl) {
            case 1:
                System.out.println("Piedra");
                break;
            
            case 2:
                System.out.println("Papel");
                break;
            
            
            case 3:
                System.out.println("Tijeras");
                break;
        }
    }
}
