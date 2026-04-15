package EjercicioAlumno;

public class Main {
    public static void main(String[] args) {
        String operacion = args[0];
        String fichero = args[1];

        switch (operacion) {

            case "init": //Alumno por defecto
                Alumno a = new Alumno("Juan", 20, 7.5);

                GsonUtil.guardar(fichero, a);
                System.out.println("Fichero creado: " + fichero);
                break;

            case "show": //Leer y cargar datos de fichero
                Alumno alumno = GsonUtil.cargar(fichero, Alumno.class);

                if (alumno != null) {
                    System.out.println("Nombre: " + alumno.nombre);
                    System.out.println("Edad: " + alumno.edad);
                    System.out.println("Nota: " + alumno.nota);
                } else {
                    System.out.println("Error al leer el fichero");
                }
                break;

            default:
                System.out.println("Operación no válida (init/show)");
        }
    }
}