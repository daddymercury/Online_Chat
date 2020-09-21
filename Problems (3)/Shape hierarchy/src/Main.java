import java.lang.Number;
import java.util.Collection;

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    double firstSide = 0;
    double secondSide = 0;
    double thirdSide = 0;
    double s = 0;
    double area = 0;


    Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        makeS();
        makeArea();
    }

    void makeS () {
        s = firstSide + secondSide + thirdSide;
    }
    void makeArea() {
        double tmp = s * (s - firstSide) * (s - secondSide) * (s - thirdSide);
        area = Math.sqrt(tmp);
    }



    @Override
    double getPerimeter() {
        return s;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Rectangle extends Shape{
    double firstSide = 0;
    double secondSide = 0;
    double perimetr = 0;
    double area = 0;

    Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        makeArea();
        makePerimetr();
    }

    void makePerimetr () {
        perimetr = 2 * (firstSide + secondSide);
    }
    void makeArea() {
        area = firstSide * secondSide;;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    double getPerimeter() {
        return perimetr;
    }
}

class Circle extends Shape {
    double radius = 0;
    double perimetr = 0;
    double area = 0;
    Circle(double radius) {
        this.radius = radius;
        makeArea();
        makePerimetr();
    }

    void makePerimetr() {
        perimetr = 2 * Math.PI * radius;
    }

    void makeArea() {
        area = Math.PI * radius * radius;
    }


    @Override
    public double getArea() {
        return area;
    }

    @Override
    double getPerimeter() {
        return perimetr;
    }
}
