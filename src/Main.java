public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck = new Truck("truck1", 8);
        Truck truck2 = new Truck("truck2", 6);


        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        Serviceable[] transports = {car2, car, truck2, truck, bicycle2, bicycle};
        for (Serviceable transport : transports) {
            station.check(transport);
            System.out.println();
        }
    }
}