public class Main {
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

    public static void main(String[] args) {
        Car nissan = new Nissan();
        System.out.println("Here are the Nissan cars " + nissan.getName() + "\n" + nissan.startEngine());

        Car mazda = new Mazda();
        System.out.println("Here are the Mazda cars " + mazda.getName()+ "\n" + mazda.accelerate());

        Car smart = new Smart();
            System.out.println("Here are the Smart cars " + smart.getName()+ "\n" + smart.startEngine());

            Nissan nissan1=new Nissan();
        System.out.println(nissan.accelerate());
    }
}
