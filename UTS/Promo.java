package UTS;

public class Promo {
    private int persen;
    private String kode;

    public Promo(String kode, int persen) {
        this.persen = persen;
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public int getPersen() {
        return persen;
    }
}
