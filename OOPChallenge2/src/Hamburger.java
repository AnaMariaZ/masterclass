public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition_1_name;
    private double addition_1_price;

    private String addition_2_name;
    private double addition_2_price;

    private String addition_3_name;
    private double addition_3_price;

    private String addition_4_name;
    private double addition_4_price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition_1_name = name;
        this.addition_1_price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition_2_name = name;
        this.addition_2_price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition_3_name = name;
        this.addition_3_price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition_4_name = name;
        this.addition_4_price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + " price is " + this.price);
        if (this.addition_1_name != null){
            hamburgerPrice += this.addition_1_price;
            System.out.println("Added " + this.addition_1_name + " for an extra " + this.addition_1_price)  ;
        }

        if (this.addition_2_name != null){
            hamburgerPrice += this.addition_1_price;
            System.out.println("Added " + this.addition_2_name + " for an extra " + this.addition_2_price)  ;
        }

        if (this.addition_3_name != null){
            hamburgerPrice += this.addition_1_price;
            System.out.println("Added " + this.addition_3_name + " for an extra " + this.addition_3_price)  ;
        }

        if (this.addition_4_name != null){
            hamburgerPrice += this.addition_1_price;
            System.out.println("Added " + this.addition_4_name + " for an extra " + this.addition_4_price)  ;
        }

        return hamburgerPrice;
    }
}
