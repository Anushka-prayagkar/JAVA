class Account {
    private String accNo;
    private String name;
    private String address;
    private String phnNo;
    private String dob;
    private double balance;

    Account(String accNo, String name, String address, String phnNo, String dob, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phnNo = phnNo;
        this.dob = dob;
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

    String getphnNo() {
        return phnNo;
    }

    String getdob() {
        return dob;
    }

    double getbalance() {
        return balance;
    }

    void setbalance(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accNo, String name, String address, String phnNo, String dob, double balance) {
        super(accNo, name, address, phnNo, dob, balance);
    }

        void deposit(double amount) {
        setbalance(getbalance() + amount);
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= getbalance()) {
            setbalance(getbalance() - amount);
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void fixedDeposit(double amount) {
        if (amount <= getbalance()) {
            setbalance(getbalance() - amount);
            System.out.println("Fixed Deposit created: " + amount);
        } else {
            System.out.println("Balance not enough.");
        }
    }

    void liquidate(double amount) {
        setbalance(getbalance() + amount);
        System.out.println("FD liquidated: " + amount);
    }
}


class LoanAccount extends Account {
    LoanAccount(String accNo, String name, String address, String phnNo, String dob, double balance) {
        super(accNo, name, address, phnNo, dob, balance);
    }

        void payEMI(double amount) {
        setbalance(getbalance() - amount);
        System.out.println("EMI amount paid: " + amount);
    }

    void topupLoan(double amount) {
        setbalance(getbalance() + amount);
        System.out.println("Top-up Loan: " + amount);
    }

    void repayment(double amount) {
        setbalance(getbalance() - amount);
        System.out.println("Loan repaid: " + amount);
    }
}

public class BankAccount {
    public static void main(String[] args) {

    }
}