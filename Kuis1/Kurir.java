package Kuis1;
/*Nama: Muhammad Hafiz
NIM: 254107020056 */

public class Kurir {
    private String nama;
    private double tarif;

    public Kurir(String nama, double tarif) {
        this.nama = nama;
        this.tarif = tarif;
    }

    public String getNama() {
        return nama;
    }
    
    public double hitungOngkir(double jarak) {
        return tarif * jarak;
    }
}
