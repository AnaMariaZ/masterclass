public class DeluxeBurger extends BasicBurger{
    private String deluxeAdition_1;
    private double deluxeAdition_1_price;
    private String deluxeAdition_2;
    private double deluxeAdition_2_price;


    public DeluxeBurger() {
        super("white", "chicken and bacon", "deluxe", 21.50);
        this.deluxeAdition_1 = "Chips";
        this.deluxeAdition_1_price = 2.5;
        this.deluxeAdition_2 = "Soda";
        this.deluxeAdition_2_price = 5.45;
    }

    @Override
    public double getPrice() {
        double totalPrice = getBasicPrice() + getDeluxeAdition_1_price() + getDeluxeAdition_2_price();
        System.out.println("Total deluxe burger price is: " + totalPrice);
        return  totalPrice;
    }

    public double getDeluxeAdition_1_price() {
        return deluxeAdition_1_price;
    }

    public double getDeluxeAdition_2_price() {
        return deluxeAdition_2_price;
    }

    public String getDeluxeAdition_1() {
        return deluxeAdition_1;
    }

    public String getDeluxeAdition_2() {
        return deluxeAdition_2;
    }


}
