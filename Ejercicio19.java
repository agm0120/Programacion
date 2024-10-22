public class Ejercicio19 {
    public static void main(String[] args) {
        
        String usuario = System.console().readLine("Piedra, papel o tijera? ");

        int numAleatorio = (int) (Math.random() * 3);
        String maquina = "";

        switch (numAleatorio) {
            case 0:
                maquina = "piedra";
                System.out.println();
                break;
            case 1:
                maquina = "papel";
                System.out.println();
                break;
            
            case 2:
                maquina = "tijeras";
                System.out.println();
                break;
            }

                //3. COMPROBAR GANADOR Y MOSTRARLO
                if (usuario.equals("papel") && maquina.equals("piedra")) {
                    System.out.println("Has ganado");
                }
                else if (usuario.equals("tijera") && maquina.equals("papel")){
                    System.out.println("Has ganado");
                }
                else if (usuario.equals("piedra") && maquina.equals("tijera")){
                    System.out.println("Has ganado");
                }
                
                else if (usuario.equals(maquina)) {
                    System.out.println("Habeis empatado");
                }
                
                else {
                    System.out.println("Gana la maquina");
                }

        
    }
}
