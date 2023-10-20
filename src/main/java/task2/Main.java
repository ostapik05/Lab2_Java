package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figures> areaFigures = new ArrayList<>();
        areaFigures.add(new Circle(5));
        areaFigures.add(new Circle(55));
        areaFigures.add(new Rectangle(4, 2));
        areaFigures.add(new Square(4));
        areaFigures.add(new Triangle(3, 4, 5));

        for (Figures a : areaFigures) {
            System.out.println("Area = " + a.area());
        }

        System.out.println(" ");

        List<Figures> Figures = new ArrayList<>();
        Figures.add(new Cube(3));
        Figures.add(new Pyramid(3, 2, 5));
        Figures.add(new Sphere(6));

        for (Figures ar : Figures) {
            System.out.println("Area = " + ar.volume());
        }

        for (Figures v : Figures) {
            System.out.println("Volume = " + v.volume());
        }
    }
}