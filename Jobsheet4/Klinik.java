package Jobsheet4;

public class Klinik {
    private String nama;
    private Dokter dokter; 
    private RuangPeriksa[] daftarRuang;

    public Klinik(String nama, int jumlahRuang) {
        this.nama = nama;
        this.daftarRuang = new RuangPeriksa[jumlahRuang];
        for (int i = 0; i < jumlahRuang; i++) {
            this.daftarRuang[i] = new RuangPeriksa("Ruang-" + (i + 1));
        }
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public void layaniPasien(Pasien pasien) {
        System.out.println("Klinik " + nama + " bersiap melayani di " + daftarRuang[0].getNomor());
        if (dokter != null) {
            dokter.periksaPasien(pasien);
        }
    }
}
