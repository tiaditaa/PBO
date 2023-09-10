package Pertemuan3;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Membaca input
            int A = scanner.nextInt();     // Membaca angka pertama
            String operator = scanner.next(); // Membaca operator
            int B = scanner.nextInt();     // Membaca angka kedua
            
            int result = 0; // Variabel untuk menyimpan hasil operasi

            // Melakukan operasi sesuai operator yang diberikan
            switch (operator) {
                case "+":
                    result = A + B;
                    break;
                case "-":
                    result = A - B;
                    break;
                case "*":
                    result = A * B;
                    break;
                case "/":
                    result = A / B;
                    break;
                case "%":
                    result = A % B;
                    break;
                default:
                    System.out.println("Operator tidak valid.");
                    return;
            }

            // Cetak hasil operasi
            System.out.println(result);

            scanner.close();
        }
    }
}