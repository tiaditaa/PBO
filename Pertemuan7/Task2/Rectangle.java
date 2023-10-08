package Pertemuan7.Task2;

// Kelas turunan (subclass) Rectangle
class Rectangle extends Shape {
    // Variabel instance width (double) dan length (double)
    private double width;
    private double length;

    // Konstruktor no-arg
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Konstruktor dengan parameter
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Getter dan setter untuk width dan length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Metode menghitung luas persegi panjang
    public double getArea() {
        return width * length;
    }

    // Metode menghitung keliling persegi panjang
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString() dari superclass
    @Override
    public String toString() {
        return "Sebuah Persegi Panjang dengan lebar=" + width 
        + " dan panjang=" + length 
        + ", yang merupakan subkelas dari " + super.toString();
    }
}