package transport;

public interface Competing {
    //Метод «Пит-стоп»
    void pitStop();
    //Метод «Лучшее время круга» (для каждого участника гонок)
    void bestLapTime();
    //Метод «Максимальная скорость» (для каждого участника гонок)
    void maxSpeed();
}
