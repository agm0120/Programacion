public class ApuntesBucles {
    public static void main(String[] args) {
        /*Estructura que repite lo que tiene dentro
         * Tipo 1: bucle (for)
         */
        
         //1.Creamos la variable y especificamos donde empieza a contar
         //2.Decimos hasta donde cuenta
         //3.Decimos i++ para que cuente de 1 en 1
        
        
         for(int i = 1; i < 11; i++/*si quiero que cuente de cuanto en cuanto pongo i=i+(numero) Hacmos i=i++ para un bucle infinito */ ){
            //Esto se va a repetir
            System.out.println(i + ".Hola");
        }

        //Tipo 2: bucle while
        //Esto se usa para hacer un bucle infinito sin decir cuantas veces quieres repetirla hasta que una variable se complete

        int num = 5;

        while(num < 10){
            System.out.println("Hola");
        }
    }
}
