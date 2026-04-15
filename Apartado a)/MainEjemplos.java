import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Clase principal (la única pública)
public class MainEjemplos {
    public static void main(String[] args) {

        System.out.println("---- EJEMPLO 1 ----");
        try {
            Scanner lector = new Scanner(new File("datos.txt"));
            System.out.println("Todo Bien");
            lector.close();
        } catch (FileNotFoundException error) {
            System.out.println("No se encontró el archivo datos.txt");
        }

        System.out.println("---- EJEMPLO 2 ----");
        try {
            System.out.println("Intentando leer archivo.txt...");
            Scanner lector2 = new Scanner(new File("archivo.txt"));
            lector2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error en Ejemplo 2: Archivo no encontrado");
        }

        System.out.println("---- EJEMPLO 3 ----");
        try {
            int resultado = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        }

        System.out.println("---- EJEMPLO 4 ----");
        try {
            System.out.println("Ejecutando bloque try");
        } catch (Exception e) {
            System.out.println("Se ha detectado un error");
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }

        System.out.println("---- EJEMPLO 5 ----");
        try {
            Ejemplo1_5.comprobarNumero(5);
        } catch (MiError e) {
            System.out.println(e.getMessage());
        }
    }
}

// Clase de excepción personalizada (NO pública)
class MiError extends Exception {
    public MiError(String mensaje) {
        super(mensaje);
    }
}

// Clase auxiliar (NO pública)
class Ejemplo1_5 {

    public static void comprobarNumero(int n) throws MiError {
        if (n == 5) {
            throw new MiError("Número prohibido");
        }
        System.out.println("Número válido");
    }
}
