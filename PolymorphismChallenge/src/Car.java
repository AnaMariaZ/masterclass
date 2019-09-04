public class Car {
    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generics car calls.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public Car() {

    }

    public String startEngine()
    {
        if (isEngine()){
            return "Car -> Start engine";
        } else {
            return  "Car -> No engine";
        }
    }

    public String accelerate()
    {
        if (isEngine()){
            return "Car -> Accelerate";
        } else {
            return "Car -> Engine is not on";
        }
    }

    public void brake()
    {
        if (isEngine()){
            System.out.println("Car -> I am slowing down");
        } else {
            System.out.println("Car -> I can't slow down, I haven't even started");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
