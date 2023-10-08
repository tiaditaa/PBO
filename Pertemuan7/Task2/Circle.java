package Pertemuan7.Task2;

// Kelas turunan (subclass) Circle
class Circle extends Shape {
    // Variabel instance radius (double)
    private double radius;

    // Konstruktor no-arg
    public Circle() {
        this.radius = 1.0;
    }

    // Konstruktor dengan parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter dan setter untuk radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode menghitung luas lingkaran
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metode menghitung keliling lingkaran
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override metode toString() dari superclass
    @Override
    public String toString() {
        return "Sebuah Lingkaran dengan radius=" + radius + ", yang merupakan subkelas dari " + super.toString();
    }
}