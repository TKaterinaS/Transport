package transport;

/**Класс Bus наследник класса Transport
 *
 */
public class Bus extends Transport{
    //Конструктор класса, содержащий параметры родительского класса,
    // т.к. своих дополнительных параметров не имеет
    public Bus(String brand,
               String model,
               int yearOfProduction,
               String country,
               String color,
               int maxSpeed) {
        super(brand, model, yearOfProduction, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString();
    }
}
