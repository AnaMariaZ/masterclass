public class Main {
    public static void main(String[] args){
        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to handle steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something specific for that type of car.

        NissanJuke nissanJuke = new NissanJuke(36);
        nissanJuke.steer(45);
        nissanJuke.accelerate(30);
        nissanJuke.accelerate(20);
        nissanJuke.accelerate(-42);
    }
}
