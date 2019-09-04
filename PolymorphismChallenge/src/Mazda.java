public class Mazda extends Car {
    public Mazda() {
        super("Sedan", 11);
    }

    @Override
    public String accelerate()
    {
        if (isEngine()){
            return "Accelerate this Mazda car";
        } else {
           return "Engine is not on for this Mazda car";
        }
    }
}
