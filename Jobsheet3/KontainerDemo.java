package Jobsheet3;

import java.util.Scanner;

public class KontainerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KontainerTest kontainerAlfa = new KontainerTest("REQ-9988", "PT. Maju Bersama", 5000);
        
        System.out.println("Nama Pemilik: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        
        System.out.print("\nMasukkan jumlah muatan baru (kg): ");
        double tambahBerat = input.nextDouble();
        kontainerAlfa.tambahMuatan(tambahBerat);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.print("\nMasukkan jumlah muatan yang akan dibongkar (kg): ");
        double turunBerat = input.nextDouble();
        kontainerAlfa.turunkanMuatan(turunBerat);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        input.close();
    }
}
