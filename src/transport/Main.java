package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Priora",
                2015,
                "Россия",
                "Белый",
                210,
                1.6,
                "МКПП",
                "Седан",
                "УА956О",
                5,
                true,
                new Car.Key(false,
                        false)
                );
        System.out.println(lada);


        Car toyota = new Car("Toyota",
                "Camry",
                2010,
                "Япония",
                "Красный",
                250,
                3.0,
                "АКПП",
                "Седан",
                "КУ723Е",
                5,
                true,
                new Car.Key(true,
                        true));
        System.out.println(toyota);

        Car nissan = new Car("Nissan",
                "March",
                2008,
                "Япония",
                "Синий",
                180,
                1.3,
                "АКПП",
                "Седан",
                "ВН098А",
                5,
                true,
                new Car.Key(true,
                        false));
        System.out.println(nissan);

        Bus liaz = new Bus("Лиаз",
                "B-905",
                2000,
                "Россия",
                "Желтый",
                170
                );
        System.out.println(liaz);
        Bus ford = new Bus("Ford",
                "OOO",
                2010,
                "Корея",
                "Белый",
                200
                );
        System.out.println(ford);
        Bus paz = new Bus("ПАЗ",
                "D-600",
                1990,
                "Россия",
                "Красный",
                170
                );
        System.out.println(paz);
    }
}