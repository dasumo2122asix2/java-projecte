import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Gestió dels professors");
            System.out.println("2. Gestió d'alumnes");
            System.out.println("3. Gestió de notes");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestió dels professors");
                    break;
                case 2:
                    System.out.println("Gestió d'alumnes");
                    break;
                case 3:
                    System.out.println("Gestió de notes");
                    break;
                case 9:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Opció invàlida");
            }
        } while (opcion != 7);
    }
}