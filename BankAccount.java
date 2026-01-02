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

}

class LoanAccount extends Account {

}

public class BankAccount {
    public static void main(String[] args) {

    }
}