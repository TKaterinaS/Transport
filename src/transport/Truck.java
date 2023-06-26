package transport;

/** Класс Truck наследующий класс Transport
 * имплементирующий интерфейс Competing (Соревнующиеся)
 */
public class Truck extends Transport implements Competing{
    private final LiftingCapacity liftingCapacity;
    private Type type;
    public Truck(String brand,
                 String model,
                 double engineCapacity,
                 LiftingCapacity liftingCapacity,
                 Type type) {
        super(brand, model, engineCapacity);
        this.liftingCapacity = liftingCapacity;
        this.type = type;
    }

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
    public Type getType(){
        return type;
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
    public void printType() {
        if (type == null){
            System.out.println("Данных по транспортному средству недостаточно.");
        }else {
            System.out.println(" Тип транспортного средства: " + type.getTypeName());
        }
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
