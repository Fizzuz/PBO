package Kuis1;
/*Nama: Muhammad Hafiz
NIM: 254107020056 */

public class Main {
    public static void main(String[] args) {
        Restoran restoran = new Restoran("Nasi Balap Puyung Khas Lombok", 4.5);
        Kurir kurir = new Kurir("Muhammad Hafiz", 2500);
        Pesanan pesanan = new Pesanan("ORDR1", 15000, kurir);

        pesanan.tampilDetail(restoran);
    }
}
