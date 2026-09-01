public class Microphone {
    String merk;
    String jenisKonektor;

    public void tangkapSuara() {
        System.out.println("Microphone " + merk + " sedang menangkap input suara.");
    }
    
    public void muteSuara() {
        System.out.println("Microphone dalam keadaan bisu (Mute).");
    }
    
    public void cetakInformasi() {
        System.out.println("--- Info Microphone ---");
        System.out.println("Merk: " + merk);
        System.out.println("Konektor: " + jenisKonektor);
    }
}
