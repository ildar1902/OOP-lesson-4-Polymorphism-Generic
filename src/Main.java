import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {

        System.out.println("        polymorphism");
        System.out.println();
        System.out.println("    Урок Полиморфизм, Generic");
        System.out.println();
        Car car1 = new Car("carBrand1", "carModel1", 1.6);
        Car car2 = new Car("carBrand2", "carModel2", 1.8);
        Car car3 = new Car("carBrand3", "carModel3", 2.0);
        Car car4 = new Car("carBrand4", "carModel4", 2.5);

        Bus bus1 = new Bus("BusBrand1", "BusModel1", 2.5);
        Bus bus2 = new Bus("BusBrand2", "BusModel2", 2.5);
        Bus bus3 = new Bus("BusBrand3", "BusModel3", 2.0);
        Bus bus4 = new Bus("BusBrand4", "BusModel4", 2.0);

        Truck truck1 = new Truck("TruckBrand1", "TruckModel1", 3.5);
        Truck truck2 = new Truck("TruckBrand2", "TruckModel2", 3.5);
        Truck truck3 = new Truck("TruckBrand3", "TruckModel3", 3.5);
        Truck truck4 = new Truck("TruckBrand4", "TruckModel4", 3.5);

        System.out.println(car1);
        DriverB andrey = new DriverB(
                "Андрей",
                true,
                6);
        andrey.printInfo(car1);
        car1.start();
        car1.pitStop();
        car1.stop();
        System.out.println("car1.bestLapTime() = " + car1.bestLapTime());
        System.out.println("car1.maxSpeed() = " + car1.maxSpeed());
        System.out.println(bus2);
        DriverD stepan = new DriverD(
                "Степан",
                true,
                5);
        stepan.printInfo(bus2);
        bus2.start();
        bus2.pitStop();
        bus2.stop();
        System.out.println("bus2.bestLapTime() = " + bus2.bestLapTime());
        System.out.println("bus2.maxSpeed() = " + bus2.maxSpeed());
        System.out.println(truck3);
        DriverC anton = new DriverC(
                "Антон",
                true,
                7);
        anton.printInfo(truck3);
        truck3.start();
        truck3.pitStop();
        truck3.stop();
        System.out.println("truck3.bestLapTime() = " + truck3.bestLapTime());
        System.out.println("truck3.maxSpeed() = " + truck3.maxSpeed());


    }
}