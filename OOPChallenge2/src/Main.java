public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("onion", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHealthAddition_1("Egg", 5.43);
        healthyBurger.addHealthAddition_2("Lentils", 3.41);
        healthyBurger.itemizeHamburger();
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("chips again", 3.51);
    }
}
