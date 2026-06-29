public class Estudiante {
    private String matricula;
    private String nombre;
    private double calificacionFundamentos;
    private double calificacionModelado;

    public Estudiante(String matricula, String nombre, double calificacionFundamentos, double calificacionModelado) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.calificacionFundamentos = calificacionFundamentos;
        this.calificacionModelado = calificacionModelado;
    }

    public double calcularPromedio() {
        return (calificacionFundamentos + calificacionModelado) / 2.0;
    }

    public String obtenerEstatus() {
        if (calcularPromedio() >= 70.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio General: " + calcularPromedio());
        System.out.println("Estatus Final: " + obtenerEstatus());
        System.out.println("------------------------------------");
    }
}