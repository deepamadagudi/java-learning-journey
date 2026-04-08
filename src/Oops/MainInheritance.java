package Oops;

public class MainInheritance {


        public static void main(String[] args) {
            Car myCar = new Car();
            // Calling inherited methods (from Vehicle)
            myCar.start();
            myCar.stop();
            // Calling child class method
            myCar.honk();
        }
    }

