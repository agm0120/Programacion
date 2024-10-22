public class EjercicioRepaso {
    public static void main(String[] args) {
        float altura = Float.parseFloat(System.console().readLine("Altura: "));
        float peso = Float.parseFloat(System.console().readLine("Peso: "));

        float imc = peso / (altura * altura);

        System.out.println("Tu imc es: " + imc);

    }
}
