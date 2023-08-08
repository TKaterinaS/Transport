package transport.driver;

import transport.Bus;
import transport.driver.Driver;

/** Класс водителей имеющих права категории D
 * для автобусов
 */

public class LicenseD extends Driver <Bus> {
    public LicenseD(String name,
                    boolean license,
                    int experience) {
        super(name, license, experience);
    }

    /** Реализация абстрактного метода "начать движение"
     * из родительского класса Driver
     */
    @Override
    public void start(Bus transport) {
        transport.start();
    }

    /** Реализация абстрактного метода "остановиться"
     * из родительского класса Driver
     */
    @Override
    public void stop(Bus transport) {
        transport.stop();
    }

    /** Реализация абстрактного метода "заправить авто"
     * из родительского класса Driver
     */
    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель " + getName() + "заправляет автобус: " + transport.getBrand());
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
