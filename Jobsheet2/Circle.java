package Jobsheet2;
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }
}
