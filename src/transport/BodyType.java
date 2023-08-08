package transport;

enum BodyType{
        SEDAN ("Седан"),
        HATCHBACK ("Хетчбэк"),
        COMPARTMENT ("Купе"),
        STATION_WAGON("Универсал"),
        OFF_ROAD_VEHICLE ("Внедорожник"),
        CROSSOVER ("Кроссовер"),
        PICKUP_TRUCK ("Пикап"),
        VAN ("Фургон"),
        MINIVAN ("Минивэн");

        private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getBodyType(){
        return bodyType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
