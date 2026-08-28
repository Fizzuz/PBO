public class BikeDemo {
    public static void main(String[] args) {
        Bike MountainBike1 = new Bike();
        Bike MountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        MountainBike1.setBrand("Trek");
        MountainBike1.speedAcceleration(10);
        MountainBike1.gearChanges(2);
        MountainBike1.printInfo();

        MountainBike2.setBrand("Giant");
        MountainBike2.speedAcceleration(20);
        MountainBike2.gearChanges(3);
        MountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}
