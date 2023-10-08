package Pertemuan7.Task3;

class Employee extends Sortable{
    public Employee(String n, double s, int hari, int bulan, int tahun) {
        nama = n;
        gaji = s;
        tanggalMasuk = hari;
        bulanMasuk = bulan;
        tahunMasuk = tahun;
    }

    public void cetak() {
        System.out.println(nama + " " + gaji + " " + tahunMasuk());
    }

    public void naikGaji(double persen) {
        gaji *= 1 + persen / 100;
    }

    public int tahunMasuk() {
        return tahunMasuk;
    }

    private String nama;
    private double gaji;
    private int tanggalMasuk;
    private int bulanMasuk;
    private int tahunMasuk;

    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (gaji < eb.gaji) return -1;
        if (gaji > eb.gaji) return 1;
        return 0;
    }
}