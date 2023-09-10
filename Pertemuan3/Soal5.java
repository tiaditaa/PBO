package Pertemuan3;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input

        String input = scanner.nextLine(); // Membaca satu baris input yang berisi plat nomor empat mobil
        String[] platNumbers = input.split(" "); // Membagi input menjadi empat plat nomor yang dipisahkan oleh spasi

        int sum = 0; // Inisialisasi variabel untuk menyimpan jumlah total plat nomor

        // Menghitung jumlah total dari empat plat nomor
        for (String platNumber : platNumbers) {
            int number = Integer.parseInt(platNumber); // Mengubah string menjadi integer
            sum += number; // Menambahkan angka plat nomor ke total sum
        }

        // Cek apakah (gabungan angka - 999999) dibagi 5 sisa bagi hasilnya 0
        if ((sum - 999999) % 5 == 0) {
            System.out.println("Jalan"); // Jika hasilnya 0, maka cetak "Jalan"
        } else {
            System.out.println("Berhenti"); // Jika tidak, cetak "Berhenti"
        }

        scanner.close(); // Menutup scanner setelah selesai membaca input
    }
}
