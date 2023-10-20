package task2;

public class Square extends Figures{//
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double volume(){
        throw new UnsupportedOperationException("Square has no volume");
    }
}