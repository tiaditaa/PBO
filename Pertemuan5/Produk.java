package Pertemuan5;

/**
 * Class ini merepresentasikan sebuah produk dengan informasi mengenai
 * nama produk, harga, kuantitas (qty), dan stok.
 */
class Produk {
    private String namaProduk; // Nama produk
    private int harga;        // Harga produk
    private int qty;          // Kuantitas produk yang dimiliki
    private int stok;         // Stok produk yang tersedia

    /**
     * Konstruktor untuk membuat objek Produk baru dengan inisialisasi
     * nama produk, harga, dan stok awal.
     *
     * @param namaProduk Nama produk
     * @param harga Harga produk
     * @param stok Jumlah stok awal produk
     */
    public Produk(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = 0;  // Awalnya qty diatur ke 0
        this.stok = stok;
    }

    /**
     * Metode untuk mendapatkan nama produk.
     *
     * @return Nama produk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * Metode untuk mendapatkan harga produk.
     *
     * @return Harga produk
     */
    public int getHarga() {
        return harga;
    }

    /**
     * Metode untuk mendapatkan kuantitas (qty) produk yang dimiliki.
     *
     * @return Kuantitas produk
     */
    public int getQty() {
        return qty;
    }

    /**
     * Metode untuk mendapatkan jumlah stok produk yang tersedia.
     *
     * @return Jumlah stok produk
     */
    public int getStok() {
        return stok;
    }

    /**
     * Metode untuk menambahkan kuantitas produk.
     *
     * @param jumlah Jumlah yang akan ditambahkan ke kuantitas produk
     */
    public void tambahQty(int jumlah) {
        qty += jumlah;
    }

    /**
     * Metode untuk mengurangi stok produk.
     *
     * @param jumlah Jumlah stok yang akan dikurangi
     */
    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
}
