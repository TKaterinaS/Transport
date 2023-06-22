package transport;

/**Класс Bus наследник класса Transport
 *
 */
public class Bus extends Transport implements Competing{
    private final TypeOfCapacity typeOfCapacity;
    public Bus(String brand,
               String model,
               double engineCapacity,
               TypeOfCapacity typeOfCapacity) {
        super(brand, model, engineCapacity);
        this.typeOfCapacity = typeOfCapacity;
    }

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    @Override
    public void start() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус прошел пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобуса "
                + getBrand() + " " + getModel() + ": " + (int) (Math.random() * 10));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса "
                + getBrand() + " " + getModel() + ": " + (int) (Math.random() * 150));
    }

    @Override
    public String toString() {
        return super.toString()
                + "Вместимость: " + typeOfCapacity +
                " от " + getTypeOfCapacity().getMin() +
                " до " + getTypeOfCapacity().getMax() + " мест";
    }
}
