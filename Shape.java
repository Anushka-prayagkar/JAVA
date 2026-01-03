abstract class Shapes {
    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shapes {
    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shapes {

}

public class Shape {
    public static void main(String[] args) {
        
    }
}
