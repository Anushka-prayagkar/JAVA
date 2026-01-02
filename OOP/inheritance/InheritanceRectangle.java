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
}

public class InheritanceRectangle {
    public static void main(String[] args) {

    }
}
