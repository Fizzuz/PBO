package Kuis1;
/*Nama: Muhammad Hafiz
NIM: 254107020056 */

public class Pesanan {
    private String kodePesanan;
    private double totalHargaMakanan;
    private Kurir kurir;

    public Pesanan(String kodePesanan, double totalHargaMakanan, Kurir kurir){
        this.kodePesanan = kodePesanan;
        this.totalHargaMakanan = totalHargaMakanan;
        this.kurir = kurir;
    }

    public double hitungTotalBiaya(Restoran restoran) {
        double ongkir = kurir.hitungOngkir(restoran.getJarakKePelanggan());

        return totalHargaMakanan + ongkir;
    }

    public void tampilDetail(Restoran restoran) {
        double ongkir = kurir.hitungOngkir(restoran.getJarakKePelanggan());
        System.out.println("Kode Pesanan : "+ kodePesanan);
        System.out.println("Restoran : "+ restoran.getNama());
        System.out.println("Kurir : "+ kurir.getNama());
        System.out.println("Harga Makanan: Rp"+ totalHargaMakanan);
        System.out.println("Ongkir : Rp"+ ongkir);
        System.out.println("Total Biaya : Rp"+ hitungTotalBiaya(restoran));
    }


}
