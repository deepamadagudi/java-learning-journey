package Oops;

// Parent class
class Food {
    String name;

    Food(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing food...");
    }

    public int deliveryTime() {
        return 0;
    }
}

// Child 1 — Pizza
class Pizza extends Food {
    String size;

    Pizza(String size) {
        super("Pizza");
        this.size = size;
    }

    @Override
    public void prepare() {
        System.out.println("🍕 Baking " + size + " Pizza in oven...");
    }

    @Override
    public int deliveryTime() {
        return 30;
    }
}

// Child 2 — Burger
class Burger extends Food {

    Burger() {
        super("Burger");
    }

    @Override
    public void prepare() {
        System.out.println("🍔 Grilling Burger patty...");
    }

    @Override
    public int deliveryTime() {
        return 15;
    }
}

// Child 3 — Biryani
class Biryani extends Food {
    String type;

    Biryani(String type) {
        super("Biryani");
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("🍛 Slow cooking " + type + " Biryani...");
    }

    @Override
    public int deliveryTime() {
        return 45;
    }
}

// Child 4 — Dosa
class Dosa extends Food {

    Dosa() {
        super("Dosa");
    }

    @Override
    public void prepare() {
        System.out.println("🫓 Spreading Dosa on hot tawa...");
    }

    @Override
    public int deliveryTime() {
        return 10;
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {

        // Customer places an order
        Food[] order = {
                new Pizza("Large"),
                new Burger(),
                new Biryani("Chicken"),
                new Dosa()
        };

        System.out.println("====== Your Order Summary ======");
        for (Food f : order) {
            f.prepare();
            System.out.println("   Delivery time: " + f.deliveryTime() + " mins");
            System.out.println();
        }

        // Find longest wait time
        int maxTime = 0;
        for (Food f : order) {
            if (f.deliveryTime() > maxTime) {
                maxTime = f.deliveryTime();
            }
        }
        System.out.println("⏳ Total wait time: " + maxTime + " mins");
    }
}