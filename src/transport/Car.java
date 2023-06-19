package transport;

/** Класс Car наследующий класс Transport
 *
 */

public class Car extends Transport{
    //«Объем двигателя» в литрах
    private double engineCapacity;
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

    //Удаленный запуск двигателя
    private Key key;

    //Конструктор содержащий параметы родительского и данного класса
    public Car(String brand,
               String model,
               int yearOfProduction,
               String country,
               String color,
               int maxSpeed,
               double engineCapacity,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean summerWinter,
               Key key) {
        super(brand, model, yearOfProduction, country, color, maxSpeed);
        setEngineCapacity(engineCapacity);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setSummerWinter(summerWinter);
        setKey(key);
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
    }

    // Геттеры и сеттеры
    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0){
            engineCapacity = 1.0;
        }
        this.engineCapacity = engineCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()){
            transmission = "МКПП";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()){
            registrationNumber = "XX000X000";
        }
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerWinter() {
        return summerWinter;
    }

    public void setSummerWinter(boolean summerWinter) {
        this.summerWinter = summerWinter;
    }
    public void changeTyres(){
        setSummerWinter(!summerWinter);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    /**Вложенный класс Key
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

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerWinter=" + summerWinter +
                ", key=" + key +
                "} " + super.toString();
    }
}
