package transport;

import transport.driver.Driver;
import transport.driver.LicenseB;
import transport.driver.LicenseC;
import transport.driver.LicenseD;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Kalina", 1.6, BodyType.SEDAN, Type.CAR);
        System.out.println(lada);
        lada.start();
        lada.pitStop();
        lada.bestLapTime();
        lada.maxSpeed();
        lada.stop();
        Car toyota = new Car("Toyota", "Camry", 3.0, BodyType.COMPARTMENT, Type.CAR);
        System.out.println(toyota);
        toyota.start();
        toyota.pitStop();
        toyota.bestLapTime();
        toyota.maxSpeed();
        toyota.stop();
        Car nissan = new Car("Nissan", "March", 1.3, BodyType.HATCHBACK, Type.CAR);
        System.out.println(nissan);
        nissan.start();
        nissan.pitStop();
        nissan.bestLapTime();
        nissan.maxSpeed();
        nissan.stop();
        Car mitsubishi = new Car("Mitsubishi","Lancer", 3.0, BodyType.STATION_WAGON, Type.CAR);
        System.out.println(mitsubishi);
        mitsubishi.start();
        mitsubishi.pitStop();
        mitsubishi.bestLapTime();
        mitsubishi.maxSpeed();
        mitsubishi.stop();

        System.out.println("************************");
        Bus liaz = new Bus("Liaz","D-0987", 4.0, TypeOfCapacity.getValue(70), Type.BUS);
        System.out.println(liaz);
        liaz.start();
        liaz.pitStop();
        liaz.bestLapTime();
        liaz.maxSpeed();
        liaz.stop();
        Bus ford = new Bus("Ford", "N55", 5.0, TypeOfCapacity.getValue(20),Type.BUS);
        System.out.println(ford);
        ford.start();
        ford.pitStop();
        ford.bestLapTime();
        ford.maxSpeed();
        ford.stop();
        Bus paz = new Bus("PAZ", "B-12", 4.75, TypeOfCapacity.getValue(50),Type.BUS);
        System.out.println(paz);
        paz.start();
        paz.pitStop();
        paz.bestLapTime();
        paz.maxSpeed();
        paz.stop();
        Bus peugeot = new Bus("Peugeot", "XXX", 5.0, TypeOfCapacity.getValue(120),Type.BUS);
        System.out.println(peugeot);
        peugeot.start();
        peugeot.pitStop();
        peugeot.bestLapTime();
        peugeot.maxSpeed();
        peugeot.stop();
        peugeot.printType();

        System.out.println("------------------");
        Truck kamaz = new Truck("Kamaz", "5", 12.0, LiftingCapacity.getValue(30),Type.TRUCK);
        System.out.println(kamaz);
        kamaz.start();
        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();
        kamaz.stop();
        Truck jac = new Truck("JAC", "LJ", 10.0, LiftingCapacity.getValue(10.0),Type.TRUCK);
        System.out.println(jac);
        jac.start();
        jac.pitStop();
        jac.bestLapTime();
        jac.maxSpeed();
        jac.stop();
        Truck gazel = new Truck("Gazele", "7", 10.0, LiftingCapacity.getValue(5.0),Type.TRUCK);
        System.out.println(gazel);
        gazel.start();
        gazel.pitStop();
        gazel.bestLapTime();
        gazel.maxSpeed();
        gazel.stop();
        Truck arco = new Truck("Arco", "M-4", 8.0, LiftingCapacity.getValue(3.0));
        System.out.println(arco);
        arco.start();
        arco.pitStop();
        arco.bestLapTime();
        arco.maxSpeed();
        arco.stop();
        arco.printType();

        System.out.println("************************");
        Driver <Car> ivan = new LicenseB("Иван", true, 5);
        Driver <Truck> fedor = new LicenseC("Федор", true, 10);
        Driver <Bus> dmitrij = new LicenseD("Дмитрий", true, 12);

        ivan.printInfo(lada);
        fedor.printInfo(kamaz);
        dmitrij.printInfo(liaz);
    }
}