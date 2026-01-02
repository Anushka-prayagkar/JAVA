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
}

class SavingsAccount extends Account {

}

class LoanAccount extends Account {

}

public class BankAccount {
    public static void main(String[] args) {

    }
}