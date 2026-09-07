package Jobsheet2;

public class CircleMain {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        
        System.out.println("Luas lingkaran: " + myCircle.area());
        System.out.println("Keliling lingkaran: " + myCircle.circumference());
    }
}
