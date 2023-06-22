package transport;

public enum TypeOfCapacity {
    ESPECIALLY_SMALL (2,10),
    SMALL (10,25),
    AVERAGE(25, 50),
    BIG (50, 80),
    ESPECIALLY_BIG (80,120);

    private int min;
    private int max;

    TypeOfCapacity(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static TypeOfCapacity getValue(int value){
        for (TypeOfCapacity e : TypeOfCapacity.values()){
            if (value >= e.getMin() && value <= e.getMax()){
                return e;
            }
        }
        return null;
    }

    TypeOfCapacity(String typeOfCapacity) {
    }
}
