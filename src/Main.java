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
        andrey.refillAuto(car1);
        andrey.printInfo(car1);
        andrey.startDrive(car1);
        car1.pitStop();
        andrey.stopDrive(car1);
        System.out.println("Лучшее время круга у водителя по имени "
                + andrey.getName() + " составляет " + car1.bestLapTime() + " минут!");
        System.out.println("А максимальная скорость составила " + car1.maxSpeed() + "км/ч!");
        System.out.println(bus2);
        DriverD stepan = new DriverD(
                "Степан",
                true,
                5);
        stepan.printInfo(bus2);
        bus2.start();
        bus2.pitStop();
        bus2.stop();
        System.out.println("Лучшее время круга у водителя по имени "
                + stepan.getName() + " составляет " + bus2.bestLapTime() + " минут!");
        System.out.println("А максимальная скорость составила " + bus2.maxSpeed() + "км/ч!");
        System.out.println(truck3);
        DriverC anton = new DriverC(
                "Антон",
                true,
                7);
        anton.printInfo(truck3);
        truck3.start();
        truck3.pitStop();
        truck3.stop();
        System.out.println("Лучшее время круга у водителя по имени "
                + anton.getName() + " составляет " + truck3.bestLapTime() + " минут!");
        System.out.println("А максимальная скорость составила " + truck3.maxSpeed() + "км/ч!");


    }
}