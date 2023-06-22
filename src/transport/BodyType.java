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

     BodyType(String bodyType) {
     }

     @Override
     public String toString() {
         return "Тип кузова: " + super.toString();
     }
     //Тип кузова: «Название типа кузова на русском языке».
 }
