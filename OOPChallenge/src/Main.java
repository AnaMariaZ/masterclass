import java.util.Scanner;

public class Main {
    // The purpose of the application is to help a fictitious company called Bills Burgers to manage
    // their process of selling hamburgers.
    // Our application will help Bill to select types of burgers, some of the additional items (additions) to
    // be added to the burgers and pricing.
    // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.
    // Each one of these items gets charged an additional price so you need some way to track how many items got added
    // and to calculate the final price (base burger with all the additions).
    // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
    // Create a Hamburger class to deal with all the above.
    // The constructor should only include the roll type, meat and price, can also include name of burger or you
    // can use a setter.
    // Also create two extra varieties of Hamburgers (subclasses) to cater for
    // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions1) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).
    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.
    public static void main(String[] args) {
       chooseBurger();
    }

    private static void chooseBurger() {
        System.out.println("Please select your burger: " + "\n" + "1. Hamburger " + "\n" + "2. Healthy Burger " + "\n" + "3. Deluxe Burger");

        Scanner keyboard = new Scanner(System.in);

        int myBurgerSelection = keyboard.nextInt();

        switch (myBurgerSelection) {
            case 1:
                BasicBurger hamburger = new BasicBurger("white bread", "pork meat", "Hamburger", 12.5);

                System.out.println("You've selected " + hamburger.getName() + "\n" + "Want something extra? We have up to 4 addition for this type of burger" + "\n" + "Do you want to proceed with adding the additions?" + "\n" + "1. Yes " + "\n" + " 2. No");

                int yesNoToHamburgerAdditions = keyboard.nextInt();

                switch (yesNoToHamburgerAdditions){
                    case 1 :
                        System.out.println("How many additions do you want? please enter your number (up to 4)");

                        int numberOfAdditions = keyboard.nextInt();

                        if (numberOfAdditions == 4){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            hamburger.setAddition_1(addition1);
                            System.out.println("Just added " + hamburger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            hamburger.setAddition_2(addition2);
                            System.out.println("You've added " + hamburger.getAddition_2());

                            System.out.println("Please select third addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition3 = keyboard.nextLine();
                            hamburger.setAddition_3(addition3);
                            System.out.println("You've added " + hamburger.getAddition_3());

                            System.out.println("Please select fourth addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition4 = keyboard.nextLine();
                            hamburger.setAddition_4(addition4);
                            System.out.println("You've added " + hamburger.getAddition_4());

                            System.out.println("Your basic burger is composed by " + hamburger.getBreadRoll() + ", " + hamburger.getMeat() + ", " + hamburger.getAddition_1() + ", " + hamburger.getAddition_2() + ", " + hamburger.getAddition_3() + ", " + hamburger.getAddition_4());

                            hamburger.getPrice();
//
                        } else if (numberOfAdditions == 3){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            hamburger.setAddition_1(addition1);
                            System.out.println("You've added " + hamburger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            hamburger.setAddition_2(addition2);
                            System.out.println("You've added " + hamburger.getAddition_2());

                            System.out.println("Please select third addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition3 = keyboard.nextLine();
                            hamburger.setAddition_3(addition3);
                            System.out.println("You've added " + hamburger.getAddition_3());


                            System.out.println("Your basic burger is composed by " + hamburger.getBreadRoll() + ", " + hamburger.getMeat() + ", " + hamburger.getAddition_1() + ", " + hamburger.getAddition_2() + ", " + hamburger.getAddition_3());

                            hamburger.getPrice();

                        } else if (numberOfAdditions == 2){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            hamburger.setAddition_1(addition1);
                            System.out.println("You've added " + hamburger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            hamburger.setAddition_2(addition2);
                            System.out.println("You've added " + hamburger.getAddition_2());

                            System.out.println("Your basic burger is composed by " + hamburger.getBreadRoll() + ", " + hamburger.getMeat() + ", " + hamburger.getAddition_1() + ", " + hamburger.getAddition_2());

                            hamburger.getPrice();

                        } else if (numberOfAdditions == 1){
                            System.out.println("Please select your addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            hamburger.setAddition_1(addition1);
                            System.out.println("You've added " + hamburger.getAddition_1());

                            System.out.println("Your basic burger is composed by " + hamburger.getBreadRoll() + ", " + hamburger.getMeat() + ", " + hamburger.getAddition_1());

                            hamburger.getPrice();
                        }

                        break;
                    case 2:
                        System.out.println("You've selected: 'No additions'. Here is the total price: " + hamburger.getPrice());
                }
                break;
            case 2:
                HealthyBurger healthyBurger = new HealthyBurger("brown bread", "chicken meat", "Healthy Burger", 15.0);
                //double totalHealthyBurgerPrice = healthyBurger.getBasicPrice();

                System.out.println("You've selected " + healthyBurger.getName() + "\n" + "Want something extra? We have up to 6 addition for this type of burger" + "\n" + "Do you want to proceed with adding the additions? " + "\n" + "1. Yes " + "\n" + " 2. No");

                int yesNoToHealthyAdditions = keyboard.nextInt();

                switch (yesNoToHealthyAdditions){
                    case 1 :
                        System.out.println("How many additions do you want? please enter your number (up to 6)");

                        int numberOfAdditions = keyboard.nextInt();

                        if (numberOfAdditions == 6){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            healthyBurger.setAddition_1(addition1);
                            System.out.println("Just added " + healthyBurger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            healthyBurger.setAddition_2(addition2);
                            System.out.println("You've added " + healthyBurger.getAddition_2());

                            System.out.println("Please select third addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition3 = keyboard.nextLine();
                            healthyBurger.setAddition_3(addition3);
                            System.out.println("You've added " + healthyBurger.getAddition_3());

                            System.out.println("Please select fourth addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition4 = keyboard.nextLine();
                            healthyBurger.setAddition_4(addition4);
                            System.out.println("You've added " + healthyBurger.getAddition_4());

                            System.out.println("Please select 5th addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition5 = keyboard.nextLine();
                            healthyBurger.setAddition_5(addition5);
                            System.out.println("You've added " + healthyBurger.getAddition_5());

                            System.out.println("Please select 6th addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition6 = keyboard.nextLine();
                            healthyBurger.setAddition_6(addition6);
                            System.out.println("You've added " + healthyBurger.getAddition_6());

                            System.out.println("Your basic burger is composed by " + healthyBurger.getBreadRoll() + ", " + healthyBurger.getMeat() + ", " + healthyBurger.getAddition_1() + ", " + healthyBurger.getAddition_2() + ", " + healthyBurger.getAddition_3() + ", " + healthyBurger.getAddition_4() +  ", " + healthyBurger.getAddition_5() +  ", " + healthyBurger.getAddition_6());

                            healthyBurger.getPrice();
//
                        } else if (numberOfAdditions == 5) {
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            healthyBurger.setAddition_1(addition1);
                            System.out.println("Just added " + healthyBurger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            healthyBurger.setAddition_2(addition2);
                            System.out.println("You've added " + healthyBurger.getAddition_2());

                            System.out.println("Please select third addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition3 = keyboard.nextLine();
                            healthyBurger.setAddition_3(addition3);
                            System.out.println("You've added " + healthyBurger.getAddition_3());

                            System.out.println("Please select fourth addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition4 = keyboard.nextLine();
                            healthyBurger.setAddition_4(addition4);
                            System.out.println("You've added " + healthyBurger.getAddition_4());

                            System.out.println("Please select third addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition5 = keyboard.nextLine();
                            healthyBurger.setAddition_5(addition5);
                            System.out.println("You've added " + healthyBurger.getAddition_5());

                            System.out.println("Your basic burger is composed by " + healthyBurger.getBreadRoll() + ", " + healthyBurger.getMeat() + ", " + healthyBurger.getAddition_1() + ", " + healthyBurger.getAddition_2() + ", " + healthyBurger.getAddition_3() + ", " + healthyBurger.getAddition_4() +  ", " + healthyBurger.getAddition_5());

                            healthyBurger.getPrice();
                        } else if (numberOfAdditions == 4){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            healthyBurger.setAddition_1(addition1);
                            System.out.println("Just added " + healthyBurger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            healthyBurger.setAddition_2(addition2);
                            System.out.println("You've added " + healthyBurger.getAddition_2());

                            System.out.println("Please select third addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition3 = keyboard.nextLine();
                            healthyBurger.setAddition_3(addition3);
                            System.out.println("You've added " + healthyBurger.getAddition_3());

                            System.out.println("Please select fourth addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition4 = keyboard.nextLine();
                            healthyBurger.setAddition_4(addition4);
                            System.out.println("You've added " + healthyBurger.getAddition_4());

                            System.out.println("Your basic burger is composed by " + healthyBurger.getBreadRoll() + ", " + healthyBurger.getMeat() + ", " + healthyBurger.getAddition_1() + ", " + healthyBurger.getAddition_2() + ", " + healthyBurger.getAddition_3() + ", " + healthyBurger.getAddition_4());

                            healthyBurger.getPrice();
                        } else if (numberOfAdditions == 3){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            healthyBurger.setAddition_1(addition1);
                            System.out.println("Just added " + healthyBurger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            healthyBurger.setAddition_2(addition2);
                            System.out.println("You've added " + healthyBurger.getAddition_2());

                            System.out.println("Please select third addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition3 = keyboard.nextLine();
                            healthyBurger.setAddition_3(addition3);
                            System.out.println("You've added " + healthyBurger.getAddition_3());

                            System.out.println("Your basic burger is composed by " + healthyBurger.getBreadRoll() + ", " + healthyBurger.getMeat() + ", " + healthyBurger.getAddition_1() + ", " + healthyBurger.getAddition_2() + ", " + healthyBurger.getAddition_3());

                            healthyBurger.getPrice();
                        } else if (numberOfAdditions == 2){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            healthyBurger.setAddition_1(addition1);
                            System.out.println("Just added " + healthyBurger.getAddition_1());

                            System.out.println("Please select second addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition2 = keyboard.nextLine();
                            healthyBurger.setAddition_2(addition2);
                            System.out.println("You've added " + healthyBurger.getAddition_2());

                            System.out.println("Your basic burger is composed by " + healthyBurger.getBreadRoll() + ", " + healthyBurger.getMeat() + ", " + healthyBurger.getAddition_1() + ", " + healthyBurger.getAddition_2());

                            healthyBurger.getPrice();
                        } else if (numberOfAdditions == 1){
                            System.out.println("Please select first addition: lettuce, cabbage, onion, avocado, egg, pickles, tomatoes");
                            String addition1 = keyboard.nextLine();
                            healthyBurger.setAddition_1(addition1);
                            System.out.println("Just added " + healthyBurger.getAddition_1());

                            System.out.println("Your basic burger is composed by " + healthyBurger.getBreadRoll() + ", " + healthyBurger.getMeat() + ", " + healthyBurger.getAddition_1());

                            healthyBurger.getPrice();
                        }

                        break;
                    case 2:
                        System.out.println("You've selected: 'No additions'. Here is the total price: " + healthyBurger.getPrice());
                }
                break;


            case 3:
                DeluxeBurger deluxeBurger = new DeluxeBurger();
                System.out.println("You've selected " + deluxeBurger.getName());
                System.out.println("Your deluxe burger is composed by " + deluxeBurger.getBreadRoll() + ", " + deluxeBurger.getMeat() + ", " + deluxeBurger.getDeluxeAdition_1() + ", " + deluxeBurger.getDeluxeAdition_2());
                deluxeBurger.getPrice();
        }

    }
}
