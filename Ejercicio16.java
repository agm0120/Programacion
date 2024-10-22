/*RULETA
 * Bienvenido/a al casino MEDAC
 * ¿Cuántos años tienes? (si tiene mas de 18, juega, si no finaliza el programa)
 * 
 * A que quieres apostar?
 *  - Colores (rojo, negro o verde)
 *  - Números (de 0 a 36 incluidos)
 *  - Secciones (1, 2 o 3)
 *  - Par o impar
 */

public class Ejercicio16 {
    public static void main(String[] args) {

        System.out.println("Bienvenido al casino MEDAC");

        String edad = (System.console().readLine("Eres mayor de 18? "));

        switch (edad) {
            case "si":
                System.out.println("1. Colores (rojo, negro o verde)");
                System.out.println("2. Números (0 a 36)");
                System.out.println("3. Secciones (1,2 o 3)");
                System.out.println("4. Par o impar");
                String seccionApuesta = System.console().readLine("Introduce el numero a lo que quieras apostar: ");
                switch (seccionApuesta) {
                    case "1":
                        String color = System.console().readLine("A que color quieres apostar? ");
                        int numCol = (int) (Math.random() * 3) + 1;
                        switch (numCol) {
                            case 1:
                                System.out.println("Negro");
                                if (color.equals("negro")) {
                                    System.out.println("Has ganado");
                                } else {
                                    System.out.println("Has perdido");
                                }
                                break;
                            case 2:
                                System.out.println("Rojo");
                                if (color.equals("rojo")) {
                                    System.out.println("Has ganado");
                                } else {
                                    System.out.println("Has perdido");
                                }
                                break;

                            case 3:
                                System.out.println("Verde");
                                if (color.equals("verde")) {
                                    System.out.println("Has ganado");
                                } else {
                                    System.out.println("Has perdido");
                                }
                                break;
                        }

                    case "2":
                        int numeroelegido = Integer.parseInt(System.console().readLine("Introduce el número al que quieres apostar: "));
                        int numeros = (int) (Math.random() * 37);
                        if (numeroelegido == numeros) {
                            System.out.println("Ha salido el numero " + numeros);
                            System.out.println("Has ganado ");
                        } else {
                            System.out.println("Ha salido el numero " + numeros);
                            System.out.println("Has perdido");
                        }

                        break;

                    case "3":

                        String seccion = System.console().readLine("A que sección quieres apostar? ");
                        System.out.println(" 1. 1-12");
                        System.out.println(" 2. 13-24");
                        System.out.println(" 3. 25-36 ");
                        int seccionAl = (int) (Math.random() * 3) + 1;
                        System.out.println(seccionAl);
                        switch (seccionAl) {
                            case 1:
                                System.out.println("1-12");
                                
                                if (seccion.equals("1")) {
                                    System.out.println("Has ganado");
                                } 
                                
                                else {
                                    System.out.println("Has perdido");
                                }
                                break;
                            
                            case 2:
                                System.out.println("13-24");
                                
                                if (seccion.equals("2")) {
                                    System.out.println("Has ganado");
                                } 
                                
                                else {
                                    System.out.println("Has perdido");
                                }
                                break;

                            case 3:
                                System.out.println("25-36");
                                if (seccion.equals("3")) {
                                    System.out.println("Has ganado");
                                } else {
                                    System.out.println("Has perdido");
                                }
                                break;

                        }
                    case "4":
                    System.out.println(" 1. Par");
                    System.out.println(" 2. Impar");
                    String parImparPregunta = System.console().readLine("Introduce el numero: ");
                    int parImpar = (int) (Math.random() * 2 + 1); 
                    switch (parImpar) {
                        case 1:
                            System.out.println("Par");
                            System.out.println(parImpar);
                            if (parImparPregunta.equals("1")) {
                                System.out.println("Has ganado");
                            } else {
                                System.out.println("Has perdido");
                            }
                            break;
                        case 2:
                            System.out.println("Impar"); 
                            System.out.println(parImpar);
                            if (parImparPregunta.equals("2")) {
                                System.out.println("Has ganado");
                            } else {
                                System.out.println("Has perdido");
                            }
                            break;
                    }
                        break;
                }
                break;
            case "no":
                System.out.println("Adiós");
                break;
        }
    }

}
