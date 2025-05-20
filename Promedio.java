import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el primer promedio: ");
        double promedio1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo promedio: ");
        double promedio2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer promedio: ");
        double promedio3 = scanner.nextDouble();

        double promedioFinal = (promedio1 + promedio2 + promedio3) / 3;

        System.out.println("Hola " + nombre + ", tu promedio final es: " + promedioFinal);
        
        scanner.close();
    }
}