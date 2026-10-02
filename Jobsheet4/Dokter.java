package Jobsheet4;

public class Dokter {
    private String nama;

    public Dokter(String nama) {
        this.nama = nama;
    }

    public void periksaPasien(Pasien pasien) {
        System.out.println("Dokter " + nama + " sedang memeriksa pasien " + pasien.getNama());
    }
}
