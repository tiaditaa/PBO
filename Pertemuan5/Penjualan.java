package Pertemuan5;

/**
 * Class ini merepresentasikan sebuah penjualan produk dengan informasi
 * mengenai nama produk, jumlah quantity, dan harga total.
 */
class Penjualan {
    private String namaProduk; // Nama produk yang dijual
    private int quantity;    // Jumlah produk yang dijual
    private int hargaTotal;  // Harga total dari penjualan

    /**
     * Konstruktor untuk membuat objek Penjualan baru dengan
     * inisialisasi nama produk, quantity, dan harga total.
     *
     * @param namaProduk Nama produk yang dijual
     * @param quantity Jumlah produk yang dijual
     * @param hargaTotal Harga total dari penjualan
     */
    public Penjualan(String namaProduk, int quantity, int hargaTotal) {
        this.namaProduk = namaProduk;
        this.quantity = quantity;
        this.hargaTotal = hargaTotal;
    }

    /**
     * Metode untuk mendapatkan nama produk dari penjualan.
     *
     * @return Nama produk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * Metode untuk mendapatkan jumlah produk yang dijual.
     *
     * @return Jumlah produk yang dijual
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Metode untuk mendapatkan harga total dari penjualan.
     *
     * @return Harga total penjualan
     */
    public int getHargaTotal() {
        return hargaTotal;
    }
}