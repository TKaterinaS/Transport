package transport.driver;

import transport.Car;
import transport.driver.Driver;

/** Класс водителей имеющих права категории В
 * для легковых автомобилей
 */

public class LicenseB extends Driver <Car> {
    public LicenseB(String name,
                    boolean license,
                    int experience) {
        super(name, license, experience);
    }

    /** Реализация абстрактного метода "начать движение"
     * из родительского класса Driver
     */
    @Override
    public void start(Car transport) {
        transport.start();
    }

    /** Реализация абстрактного метода "остановиться"
     * из родительского класса Driver
     */
    @Override
    public void stop(Car transport) {
        transport.stop();
    }

    /** Реализация абстрактного метода "заправить авто"
     * из родительского класса Driver
     */
    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель " + getName() + "заправляет автомобиль: " + transport.getBrand());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
