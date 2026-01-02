class Account {
    private String accNo;
    private String name;
    private String address;
    private String PhnNo;
    private String DOB;
    private double balance;

    Account(String accNo, String name, String address, String PhnNo, String DOB, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.PhnNo = PhnNo;
        this.DOB = DOB;
        this.balance = balance;
    }

    String getaccNo() {
        return accNo;
    }
    String getname() {
        return name;
    }
    String getaddress() {
        return address;
    }
    String getPhnNo() {
        return PhnNo;
    }
    String getDOB() {
        return DOB;
    }
    double getbalance() {
        return balance;
    }

    void setbalance(double balance) {
        this.balance = balance;
    }
    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account holder: " + name);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends Account {
    SavingsAccount(String accNo, String name, String address, String PhnNo, String DOB, double balance) {
        super(accNo, name, address, PhnNo, DOB, balance);
    }
    void deposit(double amount) {
        setbalance(getbalance() + amount);
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        setbalance(getbalance() - amount);
        System.out.println("Amount Withdrawn: " + amount);
    }
    void fixedDeposit(double amount) {
        if(amount <= getbalance()) {
            setbalance(getbalance() - amount);
            System.out.println("Fixed Deposit created: " + amount);
        }
        else {
            System.out.println("Balance not enough.");
        }
    }
    void liquidate(double amount) {
        setbalance(getbalance() + amount);
        System.out.println("FD liquidated: " + amount);
    }
}


class LoanAccount extends Account {
    LoanAccount(String accNo, String name, String address, String PhnNo, String DOB, double balance) {
        super(accNo, name, address, PhnNo, DOB, balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        
    }    
}