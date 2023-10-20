package task2;

public class Sphere extends Figures {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
