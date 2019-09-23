public class BasicBurger {
    private String breadRoll;
    private String meat;
    private String name;

    private String addition_1;
    private String addition_2;
    private String addition_3;
    private String addition_4;

    private double basicPrice;

    public BasicBurger(String breadRoll, String meat, String name, double basicPrice) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.name = name;
        this.basicPrice = basicPrice;
    }

    public double getPrice(){
        double additionPrice = 4.55;
        double totalPrice = 0;
        if (addition_1 != null && addition_2 != null && addition_3 != null && addition_4 != null){
            totalPrice = basicPrice + additionPrice *4;
            System.out.println("Total price is: " + totalPrice);
        } else if (addition_1 != null && addition_2 != null && addition_3 != null && addition_4 == null){
            totalPrice = basicPrice + additionPrice *3;
            System.out.println("Total price is: " + totalPrice);
        } else if (addition_1 != null && addition_2 != null && addition_3 == null && addition_4 == null){
            totalPrice = basicPrice + additionPrice *2;
            System.out.println("Total price is: " + totalPrice);
        } else if (addition_1 != null && addition_2 == null && addition_3 == null && addition_4 == null){
            totalPrice = basicPrice + additionPrice;
            System.out.println("Total price is: " + totalPrice);
        }
        return totalPrice;
    }

    public void setAddition_1(String addition_1) {
        this.addition_1 = addition_1;
    }

    public void setAddition_2(String addition_2) {
        this.addition_2 = addition_2;
    }

    public void setAddition_3(String addition_3) {
        this.addition_3 = addition_3;
    }

    public void setAddition_4(String addition_4) {
        this.addition_4 = addition_4;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public String getAddition_1() {
        return addition_1;
    }

    public String getAddition_2() {
        return addition_2;
    }

    public String getAddition_3() {
        return addition_3;
    }

    public String getAddition_4() {
        return addition_4;
    }

    public double getBasicPrice() {
        return basicPrice;
    }
}
