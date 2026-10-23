package Jobsheet7.Tugas;

public class Segitiga {
    private int sudut;

    public int sisaSudut(int sudutA) {
        if (sudutA <= 0 || sudutA >= 180) {
            throw new IllegalArgumentException("Sudut tidak valid: " + sudutA);
        }
        sudut = 180 - sudutA;
        return sudut;
    }

    public int sisaSudut(int sudutA, int sudutB) {
        if (sudutA <= 0 || sudutB <= 0 || (sudutA + sudutB) >= 180) {
            throw new IllegalArgumentException("Sudut tidak valid");
        }
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt((Math.pow(sisiA, 2) + Math.pow(sisiB, 2)));
        return sisiA + sisiB + c;
    }

    public int getSudut() {
        return sudut;
    }
}
