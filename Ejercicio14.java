public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1. Felicitar cumpleaños");
        System.out.println("2. Felicitar santo");
        System.out.println("3. Felicitar aniversario");

        String opcion = System.console().readLine("Introduce la opción elegida: ");

        switch (opcion) {
            
            case "1":
                int edad = Integer.parseInt(System.console().readLine("Cuantos cumples? ") );
                System.out.println("Feliz " + edad + " cumpleaños");
                
                break;
            
                case "2":
                
                String nombre = System.console().readLine("Cual es tu nombre? ");
                String genero = System.console().readLine("Cual es tu genero? ");
                switch (genero) {
                    case "hombre":
                    System.out.println("Feliz día de San " + nombre);                      
                        break;
                        
                    case "mujer":
                    System.out.println("Feliz día de Santa " + nombre);
                        break;
                }


                break;
            case "3":
                System.out.println("Feliz Aniversario");
                
                break;
            default:
                System.out.println("No existe");
                break;
        }

    }
}