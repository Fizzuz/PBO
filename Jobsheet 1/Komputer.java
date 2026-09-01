public class Komputer {
    String sistemOperasi;
    int kapasitasRAM;

    public void booting() {
        System.out.println("Memuat sistem operasi " + sistemOperasi + "...");
    }
    
    public void shutDown() {
        System.out.println("Mematikan sistem operasi dengan aman.");
    }
    
    public void cetakInformasi() {
        System.out.println("--- Info Komputer ---");
        System.out.println("Sistem Operasi: " + sistemOperasi);
        System.out.println("Kapasitas RAM: " + kapasitasRAM + " GB");
    }
}