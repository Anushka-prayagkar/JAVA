class Car {
    public void start() {
        System.out.println("Car has started.");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }

    public void AC() {
        System.out.println("AC is turned on.");
    }

    public void changeGear() {
        System.out.println("Gear has been changed.");
    }
}

class LuxuryCar {
    @Override
    public void start() {
        System.out.println("Luxury car has started.");
    }

    @Override
    public void changeGear() {
        System.out.println("Luxury car has automatic gear.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        LuxuryCar lc = new LuxuryCar();
        lc.start();
        lc.changeGear();
        lc.openSunRoof();
    }
}
