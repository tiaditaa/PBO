package Pertemuan3;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) { // Memulai loop untuk membaca input berulang
            String inputString = scanner.next(); // Membaca string dari input
            int inputValue = scanner.nextInt(); // Membaca integer dari input

            // Format dan cetak output:
            // - %15s digunakan untuk menyisipkan string ke kolom pertama yang berukuran 15 karakter.
            // - %03d digunakan untuk menyisipkan integer ke kolom kedua yang memiliki tiga digit,
            //   dengan leading zeroes jika diperlukan.
            // - %n digunakan untuk mencetak newline (baris baru) setelah setiap baris output.
            System.out.printf("%-15s%03d%n", inputString, inputValue);
        }

        scanner.close(); // Menutup scanner setelah selesai membaca input
    }
}
