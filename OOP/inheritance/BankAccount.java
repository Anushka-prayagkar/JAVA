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
}

public class BankAccount {
    public static void main(String[] args) {
        
    }    
}