import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainEjemplos {
    public static void main(String[] args) {

        System.out.println("---- EJEMPLO 1 ----");
        try {
            Scanner lector = new Scanner(new File("datos.txt"));
            System.out.println("Todo Bien");
        } catch (FileNotFoundException error) {
            System.out.println("No se encontró el archivo datos.txt");
        }

        System.out.println("---- EJEMPLO 2 ----");
        // El Ejemplo 2 DEBE tener su propio try-catch para compilar
        try {
            System.out.println("Intentando leer archivo.txt...");
            Scanner lector2 = new Scanner(new File("archivo.txt"));
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
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango");
        }
    }
}