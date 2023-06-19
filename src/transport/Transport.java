package transport;

/** Абстрактный класс Транспорт
 *
 */
public abstract class Transport {
    //Марка»
    private final String brand;
    //«Модель»
    private final String model;
    //«Год выпуска»
    private final int yearOfProduction;
    //«Страна производства»
    private final String country;
    //«Цвет кузова»
    private String color;
    //«Максимальная скорость передвижения»
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int yearOfProduction,
                     String country,
                     String color,
                     int maxSpeed) {
        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()){
            model = "default";
        }
        this.model = model;
        if (yearOfProduction <= 0){
            yearOfProduction = 2000;
        }
        this.yearOfProduction = yearOfProduction;
        if (country == null || country.isEmpty()){
            country = "default";
        }
        this.country = country;

        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()){
            color = "Белый";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0){
            maxSpeed = 200;
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
