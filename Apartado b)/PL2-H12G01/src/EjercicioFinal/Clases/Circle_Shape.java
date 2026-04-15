package EjercicioFinal.Clases;

public class Circle_Shape extends Shape {
    private double radius = 1.0; //No hay motivo para que radius sea protected como dice el diagrama

    public Circle_Shape() {
    }

    public Circle_Shape(double radius) {
        this.radius = radius;
    }

    public Circle_Shape(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
