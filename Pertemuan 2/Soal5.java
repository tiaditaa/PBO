package Pertemuan2;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Baca dua string dari pengguna
        System.out.print("Masukkan kata : ");
        String A = scanner.nextLine();
        System.out.print("Masukkan kata : ");
        String B = scanner.nextLine();

        // 1. Menghitung jumlah panjang A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Memeriksa apakah A lebih besar leksikografis daripada B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Mengganti huruf pertama A dan B menjadi huruf besar dan mencetaknya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}