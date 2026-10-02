package Jobsheet4;

public class MainTugas {
    public static void main(String[] args) {
        Klinik klinikSehat = new Klinik("Sehat Selalu", 3);
        
        Dokter dokterBudi = new Dokter("Budi");
        klinikSehat.setDokter(dokterBudi);

        Pasien pasienAndi = new Pasien("Andi");
        klinikSehat.layaniPasien(pasienAndi);
    }
}
