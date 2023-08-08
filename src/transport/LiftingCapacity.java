package transport;

public enum LiftingCapacity {
    N1 (0.5, 3.5),
    N2 (3.5, 12),
    N3 (12, 50);
    private double min;
    private double max;

    LiftingCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
    public static LiftingCapacity getValue(double value){
        for (LiftingCapacity e: LiftingCapacity.values()){
            if (value >= e.getMin() && value <= e.getMax()){
                return e;
            }
        }
        return null;
    }
    LiftingCapacity(String liftingCapacity) {
    }
}
