public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===\n");

        Estudiante estudiante1 = new Estudiante("202601", "Azael Tamez", 85.5, 90.0);
        Estudiante estudiante2 = new Estudiante("202602", "Juan Pérez", 60.0, 65.5);

        System.out.println("Información del Primer Estudiante:");
        estudiante1.mostrarInformacion();

        System.out.println("Información del Segundo Estudiante:");
        estudiante2.mostrarInformacion();
    }
}