package transport.driver;

import transport.Truck;
import transport.driver.Driver;

/** Класс водителей имеющих права категории C
 * для грузовых автомобилей
 */

public class LicenseC extends Driver <Truck> {
    public LicenseC(String name,
                    boolean license,
                    int experience) {
        super(name, license, experience);
    }

    /** Реализация абстрактного метода "начать движение"
     * из родительского класса Driver
     */
    @Override
    public void start(Truck transport) {
        transport.start();
    }

    /** Реализация абстрактного метода "остановиться"
     * из родительского класса Driver
     */
    @Override
    public void stop(Truck transport) {
        transport.stop();
    }

    /** Реализация абстрактного метода "заправить авто"
     * из родительского класса Driver
     */
    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель " + getName() + "заправляет грузовик: " + transport.getBrand());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
