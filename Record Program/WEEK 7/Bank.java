package record;
import java.util.Scanner;

class RBI {
    public double getInterestRate() {
        return 4.0;
    }
}

class SBI extends RBI {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends RBI {
    @Override
    public double getInterestRate() {
        return 6.0;
    }
}

class PNB extends RBI {
    @Override
    public double getInterestRate() {
        return 5.5;
    }
}

class Customer {
    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }
}

class Account {
    private String accountNumber;
    private double balance;
    private RBI bank; 
    private Customer customer;

    public Account(String accountNumber, double balance, RBI bank, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
        this.customer = customer;
    }

    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        // Dynamic method dispatch at runtime
        System.out.println("Rate of Interest: " + bank.getInterestRate() + "%");
    }
}

public class Bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Bank name to find the rate of Interest (RBI, SBI, ICICI, PNB): ");
        String bankName = scanner.nextLine().trim().toUpperCase();

        RBI bankReference; 
        switch (bankName) {
            case "SBI":
                bankReference = new SBI();
                break;
            case "ICICI":
                bankReference = new ICICI();
                break;
            case "PNB":
                bankReference = new PNB();
                break;
            case "RBI":
            default:
                bankReference = new RBI();
                break;
        }

        System.out.println(bankName + " rate of interest is : " + (int)bankReference.getInterestRate() + "%");
        
        scanner.close();
    }
}
