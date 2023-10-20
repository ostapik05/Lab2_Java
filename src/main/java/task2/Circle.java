package task2;

public class Circle extends Figures {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume(){
        throw new UnsupportedOperationException("Circle has no volume");
    }
}
