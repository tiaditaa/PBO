package Pertemuan7.Task2;

// Kelas induk (superclass) Shape
class Shape {
    // Variabel instance color (String) dan filled (boolean)
    private String color;
    private boolean filled;

    // Konstruktor no-arg
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Konstruktor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter dan setter untuk color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter dan setter untuk filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Metode toString()
    @Override
    public String toString() {
        return "Sebuah Bentuk dengan warna " + color + " dan " + (filled ? "terisi" : "tidak terisi");
    }
}