package Pertemuan3;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua angka sebagai string
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Membuat objek BigInteger dari string input
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        // Menambahkan dua angka
        BigInteger sum = num1.add(num2);

        // Mengalikan dua angka
        BigInteger product = num1.multiply(num2);

        // Menggunakan toString() untuk mengubah hasil ke dalam string
        String sumResult = sum.toString();
        String productResult = product.toString();

        // Menampilkan hasil tanpa leading zeros
        System.out.println(sumResult.replaceFirst("^0+", ""));
        System.out.println(productResult.replaceFirst("^0+", ""));

        scanner.close();
    }
}