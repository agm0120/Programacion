public class ApuntesCondicionales {
    public static void main(String[] args) {
        
        //ESTRUCTURAS DE CONTROL
        // if (estructuras condicionales o estructuras de selección)

        int numero =  Integer.parseInt(System.console().readLine("Introduce un número: ")) ;

        // Comprueba si el número es mayor que 100
        if (numero < 100){

            System.out.println("El número introducido es mayor que 100.");
        }

        else if (numero > 100 && numero < 200){

            System.out.println("El numero introducido es mayor que 100 y menor que 200");
        }

        /*Comprueba que el de arriba no se 
        cumple entoces si hay una que no 
        se cumple va a la otra, pero si hay 
        mas de una el (else) va a lo ultimo*/
        else{
            System.out.println("El número introducido es mayor que 200");


            // else, if, else if

            // Operadores de comparación; > < >= <= ==

            //Si hay dos opciones usamos más
        }
    }

}