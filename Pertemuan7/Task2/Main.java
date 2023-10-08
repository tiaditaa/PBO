package Pertemuan7.Task2;

// Kelas utama untuk menguji semua metode
public class Main {
    public static void main(String[] args) {
        // Menguji kelas Shape
        Shape shape1 = new Shape();
        System.out.println(shape1); // Output: Sebuah Bentuk dengan warna green dan terisi

        Shape shape2 = new Shape("merah", false);
        System.out.println(shape2); // Output: Sebuah Bentuk dengan warna merah dan tidak terisi

        // Menguji kelas Circle
        Circle circle1 = new Circle();
        // Output: Sebuah Lingkaran dengan radius=1.0, yang merupakan subkelas dari Sebuah Bentuk dengan warna green dan terisi
        System.out.println(circle1); 

        Circle circle2 = new Circle(2.5);
        // Output: Sebuah Lingkaran dengan radius=2.5, yang merupakan subkelas dari Sebuah Bentuk dengan warna green dan terisi
        System.out.println(circle2); 

        System.out.println("Luas lingkaran: " + circle2.getArea()); // Output: Luas lingkaran: 19.634954084936208
        System.out.println("Keliling lingkaran: " + circle2.getPerimeter()); // Output: Keliling lingkaran: 15.707963267948966

        // Menguji kelas Rectangle
        Rectangle rectangle1 = new Rectangle();
        // Output: Sebuah Persegi Panjang dengan lebar=1.0 dan panjang=1.0, yang merupakan subkelas dari Sebuah Bentuk dengan warna green dan terisi
        System.out.println(rectangle1); 

        Rectangle rectangle2 = new Rectangle(3.0, 4.0);
        // Output: Sebuah Persegi Panjang dengan lebar=3.0 dan panjang=4.0, yang merupakan subkelas dari Sebuah Bentuk dengan warna green dan terisi
        System.out.println(rectangle2); 

        System.out.println("Luas persegi panjang: " + rectangle2.getArea()); // Output: Luas persegi panjang: 12.0
        System.out.println("Keliling persegi panjang: " + rectangle2.getPerimeter()); // Output: Keliling persegi panjang: 14.0

        // Menguji kelas Square
        Square square1 = new Square(5.0);
        /* Output: Sebuah Persegi dengan sisi=5.0, yang merupakan subkelas dari Sebuah Persegi Panjang dengan lebar=5.0 dan panjang=5.0, 
        yang merupakan subkelas dari Sebuah Bentuk dengan warna green dan terisi*/
        System.out.println(square1); 

        System.out.println("Luas persegi: " + square1.getArea()); // Output: Luas persegi: 25.0
        System.out.println("Keliling persegi: " + square1.getPerimeter()); // Output: Keliling persegi: 20.0

        square1.setWidth(6.0); // Mengubah lebar persegi
        /* Output: Sebuah Persegi dengan sisi=6.0, yang merupakan subkelas dari Sebuah Persegi Panjang dengan lebar=6.0 dan panjang=6.0, 
        yang merupakan subkelas dari Sebuah Bentuk dengan warna green dan terisi*/
        System.out.println(square1); 
    }
}