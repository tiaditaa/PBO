package Pertemuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMain2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produk> daftarMenu = new ArrayList<>();
        ArrayList<Penjualan> daftarPesanan = new ArrayList<>();

        // Menambahkan produk makanan ke daftar menu
        daftarMenu.add(new Produk("Mochi", 3000, 10));  // Mengatur stok awal
        daftarMenu.add(new Produk("Cimol", 10000, 15));
        daftarMenu.add(new Produk("Roti Bakar", 8000, 20));
        daftarMenu.add(new Produk("Risol", 4000, 30));
        daftarMenu.add(new Produk("Donat", 3000, 18));
        daftarMenu.add(new Produk("Cireng", 2500, 16));
        daftarMenu.add(new Produk("Basreng", 5000, 12));  
        daftarMenu.add(new Produk("Batagor", 15000, 15));
        daftarMenu.add(new Produk("Bihun Gulung", 5000, 8));

        boolean selesai = false;
        while (!selesai) {
            System.out.println("Daftar Menu Makanan:");
            for (int i = 0; i < daftarMenu.size(); i++) {
                Produk produk = daftarMenu.get(i);
                System.out.println((i + 1) + ". " + produk.getNamaProduk() + " = Rp " + produk.getHarga()
                        + " (Stok: " + produk.getStok() + ")");
            }

            System.out.print("Pilih nomor menu yang ingin dipesan (0 untuk selesai): ");
            int pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= daftarMenu.size()) {
                Produk produkDipesan = daftarMenu.get(pilihan - 1);

                if (produkDipesan.getStok() > 0) {  // Pemeriksaan stok tersedia
                    System.out.print("Masukkan jumlah yang ingin dipesan: ");
                    int jumlah = input.nextInt();

                    if (jumlah <= produkDipesan.getStok()) {  // Pemeriksaan stok cukup
                        produkDipesan.tambahQty(jumlah);
                        int hargaTotalItem = produkDipesan.getHarga() * jumlah;
                        daftarPesanan.add(new Penjualan(produkDipesan.getNamaProduk(), jumlah, hargaTotalItem));

                        // Kurangi stok setelah pembelian
                        produkDipesan.kurangiStok(jumlah);

                        System.out.println("Item telah ditambahkan ke pesanan.");
                        System.out.println("Sisa Stok " + produkDipesan.getNamaProduk() + ": " + produkDipesan.getStok());

                        System.out.print("Ingin memesan item lain? (ya/tidak): ");
                        String jawaban = input.next();
                        if (!jawaban.equalsIgnoreCase("ya")) {
                            selesai = true;
                        }
                    } else {
                        System.out.println("Stok tidak cukup. Stok tersedia: " + produkDipesan.getStok());
                    }
                } else {
                    System.out.println("Maaf, produk ini sudah habis. Silakan pilih yang lain.");
                }
            } else if (pilihan == 0) {
                selesai = true;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        // Tampilkan pesanan dan total bayar
        System.out.println("Pesanan Anda:");
      
        int totalBayar = 0;
        for (Penjualan pesanan : daftarPesanan) {
            int hargaPerItem = pesanan.getHargaTotal() / pesanan.getQuantity();
            System.out.println(pesanan.getNamaProduk() + " = " + pesanan.getQuantity() + " x Rp " + hargaPerItem);
            totalBayar += pesanan.getHargaTotal();
        }
        System.out.println("Total Bayar: Rp " + totalBayar);

        input.close();
    }
}