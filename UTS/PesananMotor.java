package UTS;

public class PesananMotor extends Pesanan {
    public static final int TARIF_MINIMUM = 8000;

    public PesananMotor(String id, String namaPenumpang, double jarakKm) {
        super(id, namaPenumpang, jarakKm);
    }

      @Override
    public int hitungTarif() {
        int tarif = super.hitungTarif();

        if (tarif < TARIF_MINIMUM) {
            tarif = TARIF_MINIMUM;
        }

        return tarif;
    }

    @Override
    public String info() {
        return super.info() + " [Motor]";
    }
}
