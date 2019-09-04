package challenge.on.classes;
// Create a new class for a bank account. Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field
// Create two aditional methods
// 1. To allow the customer to deposit funds(increment the balance field)
// 2. To allow  the customer to withdraw funds. This should deduct the balance field, but not allow the withdrawal to complete if there are insufficient funds.
// You will want to create various code in the Main Class to confirm that your code is working.
// Add some souts in the 2 methods above as well.
public class Main {
    public static void main(String[] args) {
       // BankAccount myBankAccount = new BankAccount();

       // myBankAccount.setBalance(145);
       // myBankAccount.depositFunds(20);
       // myBankAccount.withdrawFunds(150);
       // myBankAccount.withdrawFunds(25);

        VipCustomer vipFirst = new VipCustomer();
        System.out.println("First vip customer " + vipFirst.getName() + " " + vipFirst.getCreditLimit() + " "  + vipFirst.getEmailAddress());
        VipCustomer vipSecond = new VipCustomer("ana", 2500);
        System.out.println("First vip customer " + vipSecond.getName() + " " + vipSecond.getCreditLimit() + " "  + vipSecond.getEmailAddress());
        VipCustomer vipThird = new VipCustomer("maria", 3000, "anamaria@gmal.com");
        System.out.println("First vip customer " + vipThird.getName() + " " + vipThird.getCreditLimit() + " "  + vipThird.getEmailAddress());
    }
}
