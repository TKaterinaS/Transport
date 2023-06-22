package transport;

/** Класс Truck наследующий класс Transport
 *
 */
public class Truck extends Transport implements Competing{
    private final LiftingCapacity liftingCapacity;
    public Truck(String brand,
                 String model,
                 double engineCapacity,
                 LiftingCapacity liftingCapacity) {
        super(brand, model, engineCapacity);
        this.liftingCapacity = liftingCapacity;
    }

    public LiftingCapacity getLiftingCapacity() {
        return liftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик прошел пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика "
                + getBrand() + " " + getModel() + ": " + (int) (Math.random() * 15));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика "
                + getBrand() + " " + getModel() + ": " + (int) (Math.random() * 100));
    }

    @Override
    public String toString() {
        return  super.toString() +
                        "Грузоподъемность: " + liftingCapacity +
                " до " + getLiftingCapacity().getMax() + " тонн.";
    }
}
