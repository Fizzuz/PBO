public class BikeDemo {
    public static void main(String[] args) {
        Bike MountainBike1 = new Bike();
        Bike MountainBike2 = new Bike();

        MountainBike1.setBrand("Trek");
        MountainBike1.speedAcceleration(10);
        MountainBike1.gearChanges(2);
        MountainBike1.printInfo();

        MountainBike2.setBrand("Giant");
        MountainBike2.speedAcceleration(20);
        MountainBike2.gearChanges(3);
        MountainBike2.printInfo();
    }
}
