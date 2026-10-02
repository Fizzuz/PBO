package Kuis1;
/*Nama: Muhammad Hafiz
NIM: 254107020056 */

public class Restoran {
    private String nama;
    private double jarakKePelanggan;

    public Restoran(String nama, double jarakKePelanggan) {
        this.nama = nama;
        this.jarakKePelanggan = jarakKePelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getJarakKePelanggan() {
        return jarakKePelanggan;
    }
}
