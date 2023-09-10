package Pertemuan3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soal1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine(); // Membaca sebuah baris teks dari pengguna dan menyimpannya dalam variabel 'input'

            // Definisikan pola regex untuk mencocokkan token (huruf alfabet).
            Pattern pattern = Pattern.compile("[A-Za-z]+"); // Membuat pola regex yang mencocokkan satu atau lebih huruf alfabet
            Matcher matcher = pattern.matcher(input); // Mencocokkan pola regex dengan input pengguna

            int tokenCount = 0; // Inisialisasi jumlah token

            while (matcher.find()) { // Selama ada pencocokan yang ditemukan
                String token = matcher.group(); // Mengambil token yang cocok
                System.out.println(token); // Mencetak token ke layar
                tokenCount++; // Menambah jumlah token
            }

            System.out.println(tokenCount); // Mencetak jumlah total token setelah loop selesai
        }
    }
}