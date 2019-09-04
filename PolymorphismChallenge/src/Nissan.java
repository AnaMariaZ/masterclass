public class Nissan extends Car{
    public Nissan() {
        super("Juke", 22);
    }

    @Override
    public String startEngine()
    {
        if (isEngine()){
            return getClass().getSimpleName() + " -> Start engine";
        } else {
            return  "Nissan -> No engine";
        }
    }

}
