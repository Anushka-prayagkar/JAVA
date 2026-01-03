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
    double length;
    double breadth;

    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class Shape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 23;
        r.breadth = 19;

        Shapes s = r;
        System.out.println(s.area());   
    }
}
