package day40_CustomClassPractice;

public class BOfA {

    public static void main(String[] args) {

        BankAccount Zain = new BankAccount();
        Zain.setAccountInfo("Savings", "Zain Afzal", "123456789");

        Zain.getAccountInfo();

        Zain.deposit(124000.80);
        Zain.checkBalance();

        Zain.withdraw(4000);
        Zain.checkBalance();

    }

}
