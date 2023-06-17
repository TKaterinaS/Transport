package transport;

public class Car {
    //«Марка»
    private final String brand;
    //«Модель»
    private final String model;
    //«Объем двигателя» в литрах
    private double engineCapacity;
    //«Цвет кузова»
    private String color;
    //«Год производства»
    private final int yearOfProduction;
    //«Страна сборки»
    private final String country;

    //«Коробка передач»
    private String transmission;
    //«Тип кузова»
    private final String bodyType;
    //«Регистрационный номер»
    private String registrationNumber;
    //«Количество мест»
    private final int numberOfSeats;
    //признак «Летняя» или «Зимняя резина»
    private boolean summerWinter;

    public Car(String brand,
               String model,
               double engineCapacity,
               String color,
               int yearOfProduction,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean summerWinter) {
        if (brand == null|| brand.isEmpty()){
            brand = "default";
        }
        this.brand = brand;

        if (model == null|| model.isEmpty()){
            model = "default";
        }
        this.model = model;

        this.engineCapacity = engineCapacity;
        this.color = color;

        if (yearOfProduction <= 0){
            yearOfProduction = 2000;
        }
        this.yearOfProduction = yearOfProduction;

        if (country == null || country.isEmpty()){
            country = "Турция";
        }
        this.country = country;

        this.transmission = transmission;

        if (bodyType == null || bodyType.isEmpty()){
            bodyType = "Седан";
        }
        this.bodyType = bodyType;

        this.registrationNumber = registrationNumber;

        this.numberOfSeats = numberOfSeats;
        if (numberOfSeats <= 0){
            numberOfSeats = 5;
        }
        this.summerWinter = summerWinter;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (Double.compare(engineCapacity, 0D) == 0){
            engineCapacity = 1.5;
        }
            this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (this.color == null || this.color.isEmpty() || this.color.isBlank()){
            color = "Белый";
        }
            this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (this.transmission == null
                || this.transmission.isEmpty()
                || this.transmission.isBlank()){
            transmission = "МКПП";
        }
            this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (this.registrationNumber == null
                || this.registrationNumber.isEmpty()
                || this.registrationNumber.isBlank()){
            registrationNumber = "Значение не может быть пустым";
        }else {
            this.registrationNumber = registrationNumber;
        }

    }

    public boolean isSummerWinter() {
        return summerWinter;
    }

    public void setSummerWinter(boolean summerWinter) {
            this.summerWinter = summerWinter;
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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Метод замены резины на сезонную
    public void changeTyres(){
        setSummerWinter(!summerWinter);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerWinter=" + summerWinter +
                '}';
    }


    /**Вложенный класс "Ключ"
     *
     */
    public static class Key{
        //Удаленный запуск двигателя
        private final boolean remoteEngineStart;
        //Бесключевой доступ
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart,
                   boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
}
