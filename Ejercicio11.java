/* */

public class Ejercicio11 {
    public static void main(String[] args) {
        // Dorsales equipo, con nueva estructura

        int numDorsal = Integer.parseInt(System.console().readLine("Introduce tu número de dorsal: "));
        String talla = System.console().readLine("Que talla de camiseta utliza:  ");

        //Estructura condicional 'switch'

        // Esto solo funciona cuando el numero es exacto y nunca cambia, si cambia se usaria el (if)

        switch (numDorsal) {
            case 1:
                System.out.println("Adrián GK");
                break;
        
            case 2:
            System.out.println("Carvajal");
                break;
            
            case 11:
            System.out.println("Paco Martos");
                break;
            
            case 69:
            System.out.println("Arturo");
                break;
            // Esto funciona como un (else) porque va sin ninguna variable
            default:
                break;
        }

        //Tambien se puede hacer con si y con no con otra variable distinta a la que usamos con los numeros
        switch (talla) {
            case ("si"):
                
                break;
            case ("no"):
            
            default:
                break;
        }


    }
}
