package Jobsheet3;

public class KontainerTest {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public KontainerTest(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (beratMuatanSaatIni + berat > kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        } else {
            beratMuatanSaatIni += berat;
        }
    }

    public void turunkanMuatan(double berat) {
        double batasMaksimal = beratMuatanSaatIni * 0.5;
        if (berat > batasMaksimal) {
            System.out.println("Maaf, pembongkaran tidak boleh melebihi 50% dari muatan saat ini!");
        } else {
            beratMuatanSaatIni -= berat;
        }
    }
}
