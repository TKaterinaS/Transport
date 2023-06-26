package transport;

public enum Type {
    BUS ("Автобус"),
    TRUCK("Грузовик"),
    CAR("Легковой автомобиль");

    private final String typeName;

    Type(String typeName) {
        this.typeName = typeName;
    }
    public String getTypeName(){
        return typeName;
    }

    @Override
    public String toString() {
        return  typeName + '\''
                 + super.toString();
    }
}
