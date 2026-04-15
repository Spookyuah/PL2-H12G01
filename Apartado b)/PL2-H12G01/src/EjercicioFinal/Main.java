package EjercicioFinal;

import EjercicioFinal.Clases.*;

public class Main {     //Esta hardcoded para la carpeta en la que queria guardarlo, dara error si se ejecuta sin tener dicha carpeta
    public static void main(String[] args) {

        //RECTANGLE
        Rectangle rect = new Rectangle(5.0f, 3.0f);
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/rectangle.json", rect);
        Rectangle rectCargado = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/rectangle.json", Rectangle.class);
        System.out.println("Rectangle cargado: " + rectCargado);


        //CIRCLE (basico)
        Circle circle = new Circle(2.5);
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/circle.json", circle);
        Circle circleCargado = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/circle.json", Circle.class);
        System.out.println("Circle cargado: " + circleCargado);


        //AUTHOR
        Author author = new Author("Laura Gallego", "lauragallego@email.com");
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/author.json", author);
        Author authorCargado = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/author.json", Author.class);
        System.out.println("Author cargado: " + authorCargado);


        //BOOK
        Book book = new Book("12345", "Omnia", author, 19.99, 10);
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/book.json", book);
        Book bookCargado = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/book.json", Book.class);
        System.out.println("Book cargado: " + bookCargado);


        //PERSON
        Person person = new Person("Renzo", "Guadalajara");
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/person.json", person);
        Person personCargado = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/person.json", Person.class);
        System.out.println("Person cargado: " + personCargado);


        //STAFF
        Staff staff = new Staff("Ana Logia", "Madrid", "IES Colegio real", 2500.0);
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/staff.json", staff);
        Staff staffCargado = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/staff.json", Staff.class);
        System.out.println("Staff cargado: " + staffCargado);


        //CIRCLE_SHAPE (clase abstracta)
        Circle_Shape shapeCircle = new Circle_Shape(4.0, "blue", true);
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/shapeCircle.json", shapeCircle);
        Circle_Shape shapeCircleCargado = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/shapeCircle.json", Circle_Shape.class);
        System.out.println("Shape Circle cargado: " + shapeCircleCargado);

        //ESTUDIANTE + ASIGNATURA
        Estudiante e1 = new Estudiante("Ana", 20);
        Estudiante e2 = new Estudiante("Tomia", 22);
        Estudiante[] lista = {e1, e2};
        Asignatura asignatura = new Asignatura("Programación", lista);
        GsonUtil.guardar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/asignatura.json", asignatura);
        Asignatura asignaturaCargada = GsonUtil.cargar("E:/zz''Clase/Java/PL2-H12G01/datosfinal/asignatura.json", Asignatura.class);
        System.out.println("Asignatura cargada: " + asignaturaCargada);
    }
}