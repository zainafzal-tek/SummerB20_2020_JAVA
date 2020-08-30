package day48_Inheritance;
/*
  create custom class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance
 */
public class BankAccount {

    String firstName;
    String lastName;
    private String accountHolder;
    private long accountNumber;
    private double balance;
    static String bankName;

    static {
        bankName = "Bank of America";
    }

    public BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing $" + amount + " to " + accountNumber);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0) {

            System.out.println("Withdrawing $" + amount + " from " + accountNumber);
            balance -= amount;

            if (amount > balance) {
                System.out.println("Not Enough Balance");
                return;
            }

        } else {
            System.out.println("Invalid Amount");
        }

    }

    public void availableBalance(){
        System.out.println("Available balance is $" + getBalance());
    }

    public String toString(){
        return bankName +
                "\n==================================================="+
                "\n"+firstName + " " + lastName +
                "\nAccount Number: "+getAccountNumber()+
                "\n==================================================="+
                "\nBalance: $"+getBalance();
    }

}
