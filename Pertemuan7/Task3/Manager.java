package Pertemuan7.Task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    public void raiseSalary(double byPercent) {
        // Tambahkan bonus 0,5% untuk setiap tahun masa kerja
        GregorianCalendar tanggalSekarang = new GregorianCalendar();
        int tahunSekarang = tanggalSekarang.get(Calendar.YEAR);
        double bonus = 0.5 * (tahunSekarang - tahunMasuk());
        super.naikGaji(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    private String secretaryName;
}
