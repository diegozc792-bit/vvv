import java.util.Scanner;

public class EscribirNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        sc.close();
    }
}
