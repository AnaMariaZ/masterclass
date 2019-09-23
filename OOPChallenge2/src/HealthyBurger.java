public class HealthyBurger extends Hamburger {
    private String healthyExtra_1_Name;
    private double healthyExtra_1_price;

    private String healthyExtra_2_Name;
    private double healthyExtra_2_price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye");
    }

    public void addHealthAddition_1(String name, double price){
        this.healthyExtra_1_Name = name;
        this.healthyExtra_1_price = price;
    }

    public void addHealthAddition_2(String name, double price){
        this.healthyExtra_2_Name = name;
        this.healthyExtra_2_price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerprice = super.itemizeHamburger();
       if (this.healthyExtra_1_Name != null){
            hamburgerprice += this.healthyExtra_1_price;
            System.out.println("Added " + this.healthyExtra_1_Name + " for an extra " + this.healthyExtra_1_price);
        }
        if (this.healthyExtra_2_Name != null){
            hamburgerprice += this.healthyExtra_2_price;
            System.out.println("Added " + this.healthyExtra_2_Name + " for an extra " + this.healthyExtra_2_price);
        }

        return hamburgerprice;
    }
}
