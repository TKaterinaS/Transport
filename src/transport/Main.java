package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Granta",
                1.6,
                "Белый",
                2001,
                "Росия",
                "МКПП",
                "Седан",
                "УК567К",
                5,
                true);
        System.out.println(lada);

        Car toyota = new Car("Toyota",
                "Camry",
                3.0,
                "Красный",
                2015,
                "Япония",
                "АКПП",
                "Седан",
                "РН385Е",
                5,
                true);
        System.out.println(toyota);

        Car nissan = new Car("Nissan",
                "March",
                1.0,
                "Синий",
                2008,
                "Япония",
                "АКПП",
                "Хэчбек",
                "ВН098А",
                5,
                true);
        System.out.println(nissan);
    }
}