package day40_CustomClassPractice;

public class BankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String clientAccountType, String clientAccountHolder, String clientAccountNumber){
        accountType = clientAccountType;
        accountHolder = clientAccountHolder;
        accountNumber = clientAccountNumber;
    }

    public void getAccountInfo(){
        System.out.println("====================================");
        System.out.println("Client Account Holder: " + accountHolder);
        System.out.println("Client Account Number: " + accountNumber);
        System.out.println("Available Balance: " + balance);
        System.out.println("====================================");
    }

    public void checkBalance(){
        System.out.println("Available Balance: $" + balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $" + amount + " to " + accountNumber);
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Not Enough Balance");
            return;
        }
        System.out.println("Withdrawing $" + amount + " from " + accountNumber);
        balance -= amount;

    }

}
