package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Zain = new BankAccount();
        BankAccount Adam = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Waqar = new BankAccount();

        Viorel.setAccountInfo("Checking", "Viorel", "963258741");
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "741258963");
        Waqar.setAccountInfo("Checking", "Waqar", "852147963");
        Zain.setAccountInfo("Checking", "Zain", "432412344");
        Adam.setAccountInfo("Checking", "Adam", "12345678");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Zain, Adam));

        for (BankAccount each : accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withdraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("************************************************************************");
        accounts.removeIf(  p -> p.balance < 1000 );
        System.out.println(accounts.size());

    }

}
