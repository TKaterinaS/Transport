package transport;

/** Класс Car наследующий класс Transport
 *
 */

public class Car extends Transport implements Competing{
    private final BodyType bodyType;
    public Car(String brand,
               String model,
               double engineCapacity,
               BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль \"" + getBrand() + "\" \"" + getModel() + "\" начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() + "\" \"" + getModel() + "\" закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль прошёл пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автомобиля "
                + getBrand() + " " + getModel() + ": " + (int) (Math.random() * 5));
    }


    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля "
                + getBrand() + " " + getModel() + ": " + (int) (Math.random() * 200));
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
