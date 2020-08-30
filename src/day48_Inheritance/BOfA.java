package day48_Inheritance;

public class BOfA {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Zain", "Afzal");

        bankAccount.setAccountHolder(bankAccount.firstName + " " + bankAccount.lastName);

        bankAccount.setAccountNumber(456331000);

        bankAccount.setBalance(50);

        bankAccount.availableBalance();
        bankAccount.deposit(500);
        bankAccount.availableBalance();
        bankAccount.withdraw(1000);


    }

}
