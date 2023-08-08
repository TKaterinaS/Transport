package transport.driver;

import transport.Transport;

public abstract class Driver <T extends Transport> {
    //«ФИО» водителя
    private final String name;

    //«Наличие водительских прав»
    private boolean license;

    //«Стаж»
    private int experience;

    public Driver(String name, boolean license, int experience) {
        this.name = name;
        this.license = license;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    //абстрактный метод «начать движение»
    public abstract void start(T Transport);

    //абстрактный метод «остановиться»
    public abstract void stop(T Transport);

    //абстрактный метод «заправить авто»
    public abstract void refuel(T Transport);
    public void printInfo(T transport){
        System.out.println("Водитель: " + name + ", управляет автомобилем: " + transport.getBrand()
                + " и будет участвовать в заезде.");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license=" + license +
                ", experience=" + experience +
                '}';
    }
}
