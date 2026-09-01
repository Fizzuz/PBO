public class PCDesktop extends Komputer {
    int dayaPSU;
    String jenisCasing;

    public void gantiKomponen() {
        System.out.println("Membuka panel casing " + jenisCasing + " untuk upgrade komponen.");
    }
    
    public void nyalakanKipas() {
        System.out.println("Kipas pendingin tambahan pada PC dinyalakan.");
    }
    
    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Daya Power Supply: " + dayaPSU + " Watt");
        System.out.println("Jenis Casing: " + jenisCasing);
    }
}
