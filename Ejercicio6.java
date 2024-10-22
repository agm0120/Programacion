/*Calculadora de horóscopos 
 * Introduce tu dia de nacimiento: 12
 * Introduce tu mes de nacimiento: 5
 * 
 * Eres tauro
 * 
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        String mes = System.console().readLine("Cual es tu mes de nacimiento: ");
        int dia = Integer.parseInt(System.console().readLine("Cual es tu dia de nacimiento: "));
        
        //Variables
        //- Primitivas (fáciles): int, char,float
        //- Complejas: String

        if (mes.equals("Enero") || mes.equals("1")) {
            if (dia >= 1 && dia <= 19){
                System.out.println("Capricornio");
            }
            else if (dia >= 20 && dia <= 31){
                System.out.println("Acuario");
            }
        } 
        
        else if (mes .equals("Febrero") || mes.equals("2")) {
            if (dia >= 1 && dia <= 18){
                System.out.println("Acuario");
            }

            else if (dia >= 19 && dia <= 30){
            System.out.println("Piscis");
            }

        }
         
        else if (mes .equals("Marzo") || mes.equals("3")) {
            if (dia >= 1 && dia <= 20){
                System.out.println("Piscis");
        }
            else if (dia >= 21 && dia <= 31){
            System.out.println("Aries");
            }
            } 
    }
}
