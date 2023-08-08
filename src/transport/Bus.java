package transport;

/**Класс Bus наследник класса Transport
 * имплементирующий интерфейс Competing (Соревнующиеся)
 */
public class Bus extends Transport implements Competing{
    private final TypeOfCapacity typeOfCapacity;
    private Type type;
    public Bus(String brand,
               String model,
               double engineCapacity,
               TypeOfCapacity typeOfCapacity,
               Type type) {
        super(brand, model, engineCapacity);
        this.typeOfCapacity = typeOfCapacity;
        this.type = type;
    }

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

    public Type getType(){
        return type;
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
    public void printType() {
        if (type == null){
            System.out.println("Данных по транспортному средству недостаточно.");
        }else {
            System.out.println(" Тип транспортного средства: " + type.getTypeName());
        }
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
