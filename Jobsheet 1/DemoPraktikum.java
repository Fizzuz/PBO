public class DemoPraktikum {
    public static void main(String[] args) {
        System.out.println("Tugas Praktikum PBO - Muhammad Hafiz\n");

        Router rtr = new Router();
        rtr.merk = "TP-Link";
        rtr.jumlahAntena = 4;
        rtr.cetakInformasi();
        rtr.pancarkanSinyal();
        rtr.restartPerangkat();
        System.out.println();

        Microphone mic = new Microphone();
        mic.merk = "Fantech Levioso";
        mic.jenisKonektor = "USB Type-C";
        mic.cetakInformasi();
        mic.tangkapSuara();
        mic.muteSuara();
        System.out.println();

        Laptop lpt = new Laptop();
        lpt.sistemOperasi = "Windows 11";
        lpt.kapasitasRAM = 16;
        lpt.kapasitasBaterai = 57;
        lpt.ukuranLayar = 15.6;
        lpt.cetakInformasi();
        lpt.booting(); 
        lpt.isiDaya();
        lpt.lipatLayar();
        lpt.shutDown();
        System.out.println();

        PCDesktop pc = new PCDesktop();
        pc.sistemOperasi = "Ubuntu Linux";
        pc.kapasitasRAM = 32;
        pc.dayaPSU = 650;
        pc.jenisCasing = "Mid Tower ATX";
        pc.cetakInformasi();
        pc.booting();
        pc.nyalakanKipas();
        pc.gantiKomponen();
        pc.shutDown();
    }
}
