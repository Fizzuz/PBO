public class Laptop extends Komputer {
    int kapasitasBaterai;
    double ukuranLayar;

    public void isiDaya() {
        System.out.println("Menghubungkan adaptor untuk mengisi daya baterai.");
    }
    
    public void lipatLayar() {
        System.out.println("Layar laptop berukuran " + ukuranLayar + " inci ditutup.");
    }
    
    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " Wh");
        System.out.println("Ukuran Layar: " + ukuranLayar + " Inci");
    }
}
