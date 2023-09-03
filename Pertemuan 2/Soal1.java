package Pertemuan2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah perulangan : ");
        int t = scanner.nextInt(); // Menyimpan jumlah kasus uji
    
        for (int i = 0; i < t; i++) {
            try {
                System.out.print("Masukan angka yang ingin dicek : ");
                long n = scanner.nextLong(); // Membaca masukan angka bulat
    
                System.out.println(n + "\nBisa dimasukkan ke :");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte"); // Menampilkan bahwa angka bisa muat dalam tipe data byte
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short"); // Menampilkan bahwa angka bisa muat dalam tipe data short
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int"); // Menampilkan bahwa angka bisa muat dalam tipe data int
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long"); // Menampilkan bahwa angka bisa muat dalam tipe data long
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + "\nTidak dapat dimasukkan kemanapun"); /* Menangani jika angka 
                tidak cocok dengan tipe data yang ada*/
            }
        }
    
        scanner.close(); // Menutup objek Scanner setelah selesai digunakan
    } 
}