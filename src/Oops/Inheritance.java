package Oops;

// Superclass (Parent)
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}
// Subclass (Child) - Inherits from Vehicle
class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking!");
    }
}
