public class HealthyBurger extends BasicBurger{
    private String addition_5;
    private String addition_6;

    public HealthyBurger(String breadRoll, String meat, String name, double basicPrice) {
        super(breadRoll, meat, name, basicPrice);

    }

    @Override
    public double getPrice() {
        double additionPrice = 4.55;
        double totalPrice = 0;
        if (super.getAddition_1() != null && super.getAddition_2() != null && super.getAddition_3() != null && super.getAddition_4() != null && addition_5 != null && addition_6 != null){
            totalPrice = super.getBasicPrice() + additionPrice *6;
            System.out.println("Total price is: " + totalPrice);
        } else if (super.getAddition_1() != null && super.getAddition_2() != null && super.getAddition_3() != null && super.getAddition_4() != null && addition_5 != null && addition_6 == null){
            totalPrice = super.getBasicPrice() + additionPrice *5;
            System.out.println("Total price is: " + totalPrice);
        } else if (super.getAddition_1() != null && super.getAddition_2() != null && super.getAddition_3() != null && super.getAddition_4() != null && addition_5 == null && addition_6 == null){
            totalPrice = super.getBasicPrice() + additionPrice *4;
            System.out.println("Total price is: " + totalPrice);
        } else if (super.getAddition_1() != null && super.getAddition_2() != null && super.getAddition_3() != null && super.getAddition_4() == null && addition_5 == null && addition_6 == null){
            totalPrice = super.getBasicPrice() + additionPrice*3;
            System.out.println("Total price is: " + totalPrice);
        } else if (super.getAddition_1() != null && super.getAddition_2() != null && super.getAddition_3() == null && super.getAddition_4() == null && addition_5 == null && addition_6 == null){
            totalPrice = super.getBasicPrice() + additionPrice*2;
            System.out.println("Total price is: " + totalPrice);
        } else if (super.getAddition_1() != null && super.getAddition_2() == null && super.getAddition_3() == null && super.getAddition_4() == null && addition_5 == null && addition_6 == null){
            totalPrice = super.getBasicPrice() + additionPrice*1;
            System.out.println("Total price is: " + totalPrice);
        }
        return totalPrice;
    }

    public void setAddition_5(String addition_5) {
        this.addition_5 = addition_5;
    }

    public void setAddition_6(String addition_6) {
        this.addition_6 = addition_6;
    }

    public String getAddition_5() {
        return addition_5;
    }

    public String getAddition_6() {
        return addition_6;
    }
}
