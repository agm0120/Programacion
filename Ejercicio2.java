public class Ejercicio2 {
    public static void main(String[] args) {
        int hora = Integer.parseInt(System.console().readLine("Que hora es en formato 24h: "));

        if (hora>=6 && hora<=12){
            System.out.println("Buenos dias");
        }
        else if (hora>=13 && hora<=20){
            System.out.println("Buenas tardes");

        }
        else if (hora>=20 && hora<=24){
            System.out.println("Buenas noches");

        }
        else if (hora>=0 && hora<=5){
            System.out.println("Buenas noches");

        }
        else {
            System.out.println("Esa no es una hora correcta");
        }
    }
}
