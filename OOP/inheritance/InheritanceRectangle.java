package OOP.inheritance;

class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        length = breadth = 1;
    }
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle {
    double height;

    Cuboid() {
        height = 1;
    }
    Cuboid(double h) {
        height = h;
    }
    Cuboid(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class InheritanceRectangle {
    public static void main(String[] args) {
            Cuboid c = new Cuboid(5, 3, 15);
            System.out.println(c.volume());
    }
}
