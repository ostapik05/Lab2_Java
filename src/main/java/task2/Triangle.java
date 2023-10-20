package task2;

public class Triangle extends Figures {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return 1 / 4. * Math.sqrt((sideA + sideB + sideC) * (sideB + sideC - sideA) *
                (sideA + sideC - sideB) * (sideA + sideB - sideC));
    }
    @Override
    public double volume(){
        throw new UnsupportedOperationException("Triangle has no volume");
    }
}
