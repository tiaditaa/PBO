package Pertemuan3;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalSales = scanner.nextInt(); // Membaca jumlah penjualan bulan ini
        int itemPrice = 50000; // Harga setiap item
        int baseSalary = 500000; // Gaji pokok

        // Menghitung bonus berdasarkan jumlah penjualan
        double bonus = 0;
        if (totalSales >= 40) {
            if (totalSales > 80) {
                // Bonus 35% jika penjualan di atas 80 item
                bonus = totalSales * itemPrice * 0.35;
            } else {
                // Bonus 25% jika penjualan minimal 40 item
                bonus = totalSales * itemPrice * 0.25;
            }
        } else if (totalSales < 15) {
            // Denda pemotongan 15% jika penjualan di bawah 15 item
            double penalty = (15 - totalSales) * itemPrice * 0.15;
            bonus -= penalty;
        } else {
            // Bonus 10% untuk penjualan di antara 15 dan 40 item
            bonus = totalSales * itemPrice * 0.10;
        }

        // Menghitung total gaji
        double totalSalary = baseSalary + bonus;

        // Cetak total gaji setelah di bulatkan ke integer terdekat
        System.out.println(Math.round(totalSalary));
        
        scanner.close();
    }
}