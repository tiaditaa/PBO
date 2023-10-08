package Pertemuan7.Task2;

// Kelas turunan (subclass) Square
class Square extends Rectangle {
    // Konstruktor dengan parameter
    public Square(double side) {
        super(side, side); // Memanggil konstruktor superclass Rectangle(double, double)
    }

    // Override metode toString() dari superclass
    @Override
    public String toString() {
        return "Sebuah Persegi dengan sisi=" + getWidth() 
        + ", yang merupakan subkelas dari " + super.toString();
    }

    // Override metode setWidth dan setLength untuk mempertahankan geometri persegi
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }
}