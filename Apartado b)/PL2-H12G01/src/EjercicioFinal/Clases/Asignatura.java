package EjercicioFinal.Clases;

public class Asignatura {
    private String nombre;
    private Estudiante[] estudiantes;

    public Asignatura() {}

    public Asignatura(String nombre, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }
}
