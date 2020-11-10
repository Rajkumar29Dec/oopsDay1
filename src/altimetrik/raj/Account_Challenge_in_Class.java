package altimetrik.raj;

public class Account_Challenge_in_Class {
    private long accountNumber;
    private String name,email;
    private int balance,phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    two additional methods

    public void deposit(int dep_amount){
        balance=balance+dep_amount;
        System.out.println("In Your Account Number " +accountNumber+
                "has"+balance+"amount");
    }

    public void withdraw(int withdraw_amount){
        if (withdraw_amount<(balance)){
            balance=balance-withdraw_amount;
            System.out.println("You withdraw"+withdraw_amount+"from your Your account"+accountNumber+"Now balance is"+
                    balance);
        }
        else
            System.out.println("Your Minimum balance should be 500");

    }
}
