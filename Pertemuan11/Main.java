package Pertemuan11;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Family family = new Family();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan Paman");
            System.out.println("2. Tambahkan Keponakan");
            System.out.println("3. Tambahkan Hadiah");
            System.out.println("4. Daftar Paman");
            System.out.println("5. Daftar Keponakan");
            System.out.println("6. Daftar Hadiah");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama Paman: ");
                    String uncleName = scanner.nextLine();
                    family.addUncle(uncleName);
                    System.out.println("Paman " + uncleName + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan nama Keponakan: ");
                    String nieceName = scanner.nextLine();
                    System.out.print("Masukkan tanggal lahir Keponakan (hari bulan): ");
                    int day = scanner.nextInt();
                    int month = scanner.nextInt();
                    family.addNiece(nieceName, day, month);
                    System.out.println("Keponakan " + nieceName + " ditambahkan.");
                    break;

                case 3:
                    System.out.print("Masukkan nama Paman yang memberi hadiah: ");
                    String giverName = scanner.nextLine();
                    Uncle giver = family.findUncle(giverName);

                    if (giver != null) {
                        System.out.print("Masukkan nama Keponakan yang menerima hadiah: ");
                        String recipientName = scanner.nextLine();
                        Niece recipient = family.findNiece(recipientName);

                        if (recipient != null) {
                            System.out.print("Masukkan deskripsi hadiah: ");
                            String description = scanner.nextLine();
                            giver.addPresent(recipient, description);
                            System.out.println("Hadiah ditambahkan.");
                        } else {
                            System.out.println("Keponakan tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Paman tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Paman:");
                    family.listUncles();
                    break;

                case 5:
                    System.out.println("Daftar Keponakan:");
                    family.listNieces();
                    break;

                case 6:
                    System.out.println("Daftar Hadiah:");
                    listPresents(family);
                    break;

                case 0:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    private static void listPresents(Family family) {
        for (Uncle uncle : family.getUncles()) {
            System.out.println("Hadiah dari " + uncle.getName() + ":");
            uncle.listPresents();
            System.out.println();
        }
    }
}
