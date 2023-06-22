package transport;

/** Абстрактный класс Транспорт
 *
 */
public abstract class Transport {
    //Марка»
    private final String brand;
    //«Модель»
    private final String model;
    //«Объем двигателя» в литрах
    private final double engineCapacity;

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    //абстрактный метод «начать движение»
    public abstract void start();

    //абстрактный метод «закончить движение»
    public abstract void stop();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
