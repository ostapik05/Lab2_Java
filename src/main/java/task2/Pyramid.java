package task2;

public class Pyramid extends Figures {
    private final double sideA;
    private final double sideB;
    private final double height;

    public Pyramid(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double area() {
        double baseArea = sideA * sideB;
        double sideArea = sideA * Math.sqrt((sideB / 2) * (sideB / 2) + height * height);
        return baseArea + 4 * sideArea;
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * (sideA * sideB) * height;
    }
}
