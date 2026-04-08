package AccessModifier;

class Vehicle {

    protected String brand;   // accessible in subclass ✅
    private   String engineCode; // NOTs accessible in subclass ❌

    public Vehicle(String brand, String engineCode) {
        this.brand      = brand;
        this.engineCode = engineCode;
    }

    protected void start() {
        System.out.println(brand + " is starting...");
    }

    private void showEngineCode() {
        System.out.println("Engine: " + engineCode); // only inside Vehicle
    }
}

class Car extends Vehicle {

    private int seats;

    public Car(String brand, String engineCode, int seats) {
        super(brand, engineCode);
        this.seats = seats;
    }

    public void carInfo() {
        // ✅ protected — subclass can access
        System.out.println("Brand : " + brand);
        System.out.println("Seats : " + seats);
        start(); // ✅ protected method — accessible

        // ❌ private — compile error!
        // System.out.println(engineCode);
        // showEngineCode();
    }
}

public class AccessModifier2 {
    public static void main(String[] args) {

        Car c = new Car("Toyota", "V8-001", 5);
        c.carInfo();

        // ✅ protected accessible from subclass object
        System.out.println(c.brand);

        // ❌ private — not accessible here
        // System.out.println(c.engineCode);
    }
}
