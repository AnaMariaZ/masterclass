package challenge.on.classes;
// Create a new class for a bank account. Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds(increment the balance field)
// 2. To allow  the customer to withdraw funds. This should deduct the balance field, but not allow the withdrawal to complete if there are insufficient funds.
// You will want to create various code in the Main Class to confirm that your code is working.
// Add some souts in the 2 methods above as well.
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this(56789, 100, "Bob Mendes", "bob@gmail.com", "0729092684");
        System.out.println("Account empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone(){
        return this.customerPhone;
    }

    public double depositFunds(double fundsToDeposit){
        this.balance = this.balance + fundsToDeposit;
        System.out.println("The new balance is " + this.balance);
        return this.balance;
    }

    public double withdrawFunds(double fundsToWithdraw){
        if (this.balance - fundsToWithdraw < 0){
            System.out.println("There are not enough funds to withdraw");
        } else {
            this.balance -= fundsToWithdraw;
            System.out.println("After withdrawal, the balance is " + this.balance);
        }

        return this.balance;
    }
}
