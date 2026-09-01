public class Router {
    String merk;
    int jumlahAntena;

    public void pancarkanSinyal() {
        System.out.println("Router " + merk + " memancarkan sinyal WiFi.");
    }
    
    public void restartPerangkat() {
        System.out.println("Sistem router sedang dimuat ulang...");
    }
    
    public void cetakInformasi() {
        System.out.println("--- Info Router ---");
        System.out.println("Merk: " + merk);
        System.out.println("Jumlah Antena: " + jumlahAntena);
    }
}